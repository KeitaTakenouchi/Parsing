package jobslicer.component;

import gnu.trove.set.hash.TIntHashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HierarchyResolver
{
	private ArrayList<Field> fieldList = new ArrayList<>();

	public void addActualName(String name)
	{
		String[] split = name.split("\\.");
		Field owner = null;
		for(String s : split)
		{
			Field node = new Field(owner, s);
			int i = fieldList.indexOf(node);

			if(i < 0)//if not exist.
				fieldList.add(node);
			else
				node = fieldList.get(i);

			if(owner != null)
				owner.addChild(node);
			owner = node;
		}
	}

	public List<String> getImpactedFields(String name)
	{
		String[] split = name.split("\\.");
		Field owner = null;
		for(String s : split)
			owner = new Field(owner, s);

		int i = fieldList.indexOf(owner);
		Field node = fieldList.get(i);
		if(node == null) return Collections.emptyList();

		List<String> ret = new ArrayList<String>();
		for(Field f : node.getLeaves())
			ret.add(f.getFullName());

		return ret;
	}

	private int depth = 0;
	private TIntHashSet deadDepth = new TIntHashSet();
	public void dump()
	{
		ArrayList<Field> list = new ArrayList<Field>();
		for(Field f : fieldList)
		{
			if(f.getParent() == null)
				list.add(f);
		}
		for(Field root : list)
		{
			deadDepth.clear();
			deadDepth.add(0);
			dumpNodeOfTree(root);
		}
	}

	private void dumpNodeOfTree(Field parent)
	{
		depth++;
		System.out.println(parent.getName());
		for(int i = 0 ; i < parent.getChildren().length ; i++)
		{
			if(i == parent.getChildren().length-1)
			{
				deadDepth.add(depth);
			}
			for(int j = 0 ; j < depth ; j++)
			{
				if(deadDepth.contains(j))
					System.out.print("\t");
				else
					System.out.print("|\t");
			}
			if(i == parent.getChildren().length-1)
				System.out.print("`-- ");
			else
				System.out.print("|-- ");

			dumpNodeOfTree(parent.getChildren()[i]);
		}
		depth--;
	}

	private class Field
	{
		private Field parent;
		private List<Field> children = new ArrayList<HierarchyResolver.Field>();
		private String name;

		private Field(Field parent, String name)
		{
			this.parent = parent;
			this.name = name;
		}

		private void addChild(Field f)
		{
			if(!children.contains(f))
				children.add(f);
		}

		private Field getParent()
		{
			return parent;
		}

		private Field[] getChildren()
		{
			return children.toArray(new Field[0]);
		}

		private String getName()
		{
			return name;
		}

		private String getFullName()
		{
			return (parent == null)?  name : parent.getFullName() + "." + name;
		}

		private List<Field> getLeaves()
		{
			ArrayList<Field> ret = new ArrayList<Field>();
			if(children.isEmpty())
				ret.add(this);
			for(Field c : children)
				ret.addAll(c.getLeaves());
			return ret;
		}

		@Override
		public String toString()
		{
			return getFullName();
		}

		@Override
		public int hashCode()
		{
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((parent == null) ? 0 : parent.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj)
		{
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Field other = (Field) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (name == null)
			{
				if (other.name != null)
					return false;
			}
			else if (!name.equals(other.name))
				return false;
			if (parent == null)
			{
				if (other.parent != null)
					return false;
			}
			else if (!parent.equals(other.parent))
				return false;
			return true;
		}

		private HierarchyResolver getOuterType()
		{
			return HierarchyResolver.this;
		}




	}
}
