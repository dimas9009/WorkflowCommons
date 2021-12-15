// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowcommonsunittests.proxies;

public class DummyWFUserTask extends system.proxies.WorkflowUserTask
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowCommonsUnitTests.DummyWFUserTask";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Description("Description"),
		StartTime("StartTime"),
		DueDate("DueDate"),
		EndTime("EndTime"),
		Outcome("Outcome"),
		State("State"),
		Reason("Reason"),
		WorkflowUserTask_TargetUsers("System.WorkflowUserTask_TargetUsers"),
		WorkflowUserTask_Assignee("System.WorkflowUserTask_Assignee"),
		WorkflowUserTask_Workflow("System.WorkflowUserTask_Workflow"),
		WorkflowUserTask_WorkflowUserTaskDefinition("System.WorkflowUserTask_WorkflowUserTaskDefinition");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public DummyWFUserTask(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowCommonsUnitTests.DummyWFUserTask"));
	}

	protected DummyWFUserTask(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dummyWFUserTaskMendixObject)
	{
		super(context, dummyWFUserTaskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("WorkflowCommonsUnitTests.DummyWFUserTask", dummyWFUserTaskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowCommonsUnitTests.DummyWFUserTask");
	}

	/**
	 * @deprecated Use 'DummyWFUserTask.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static workflowcommonsunittests.proxies.DummyWFUserTask initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowcommonsunittests.proxies.DummyWFUserTask.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowcommonsunittests.proxies.DummyWFUserTask initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowcommonsunittests.proxies.DummyWFUserTask(context, mendixObject);
	}

	public static workflowcommonsunittests.proxies.DummyWFUserTask load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowcommonsunittests.proxies.DummyWFUserTask.initialize(context, mendixObject);
	}

	public static java.util.List<workflowcommonsunittests.proxies.DummyWFUserTask> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowcommonsunittests.proxies.DummyWFUserTask> result = new java.util.ArrayList<workflowcommonsunittests.proxies.DummyWFUserTask>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowCommonsUnitTests.DummyWFUserTask" + xpathConstraint))
			result.add(workflowcommonsunittests.proxies.DummyWFUserTask.initialize(context, obj));
		return result;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowcommonsunittests.proxies.DummyWFUserTask that = (workflowcommonsunittests.proxies.DummyWFUserTask) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "WorkflowCommonsUnitTests.DummyWFUserTask";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
