package analysis;

public class DummyNode implements Node
{
	private final int nodeId; 
	
	public DummyNode(int nodeId)
	{
		super();
		this.nodeId = nodeId;
	}

	@Override
	public int getId()
	{
		return nodeId;
	} 

	@Override
	public String toString() {
		return "[DUMMY_" + getId() +"]";
	}
	
}
