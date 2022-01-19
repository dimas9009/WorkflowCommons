// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowcommonsunittests.proxies;

public class DummyWorkflow extends system.proxies.Workflow
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowCommonsUnitTests.DummyWorkflow";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Description("Description"),
		StartTime("StartTime"),
		EndTime("EndTime"),
		DueDate("DueDate"),
		CanBeRestarted("CanBeRestarted"),
		CanBeContinued("CanBeContinued"),
		State("State"),
		Reason("Reason"),
		DummyWorkflow_ExpenseRequest("WorkflowCommonsUnitTests.DummyWorkflow_ExpenseRequest"),
		Workflow_WorkflowDefinition("System.Workflow_WorkflowDefinition");

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

	public DummyWorkflow(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowCommonsUnitTests.DummyWorkflow"));
	}

	protected DummyWorkflow(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dummyWorkflowMendixObject)
	{
		super(context, dummyWorkflowMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("WorkflowCommonsUnitTests.DummyWorkflow", dummyWorkflowMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowCommonsUnitTests.DummyWorkflow");
	}

	/**
	 * @deprecated Use 'DummyWorkflow.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static workflowcommonsunittests.proxies.DummyWorkflow initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowcommonsunittests.proxies.DummyWorkflow.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowcommonsunittests.proxies.DummyWorkflow initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowcommonsunittests.proxies.DummyWorkflow(context, mendixObject);
	}

	public static workflowcommonsunittests.proxies.DummyWorkflow load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowcommonsunittests.proxies.DummyWorkflow.initialize(context, mendixObject);
	}

	public static java.util.List<workflowcommonsunittests.proxies.DummyWorkflow> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowcommonsunittests.proxies.DummyWorkflow> result = new java.util.ArrayList<workflowcommonsunittests.proxies.DummyWorkflow>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowCommonsUnitTests.DummyWorkflow" + xpathConstraint))
			result.add(workflowcommonsunittests.proxies.DummyWorkflow.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of DummyWorkflow_ExpenseRequest
	 */
	public final expenserequestexample.proxies.ExpenseRequest getDummyWorkflow_ExpenseRequest() throws com.mendix.core.CoreException
	{
		return getDummyWorkflow_ExpenseRequest(getContext());
	}

	/**
	 * @param context
	 * @return value of DummyWorkflow_ExpenseRequest
	 */
	public final expenserequestexample.proxies.ExpenseRequest getDummyWorkflow_ExpenseRequest(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		expenserequestexample.proxies.ExpenseRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DummyWorkflow_ExpenseRequest.toString());
		if (identifier != null)
			result = expenserequestexample.proxies.ExpenseRequest.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DummyWorkflow_ExpenseRequest
	 * @param dummyworkflow_expenserequest
	 */
	public final void setDummyWorkflow_ExpenseRequest(expenserequestexample.proxies.ExpenseRequest dummyworkflow_expenserequest)
	{
		setDummyWorkflow_ExpenseRequest(getContext(), dummyworkflow_expenserequest);
	}

	/**
	 * Set value of DummyWorkflow_ExpenseRequest
	 * @param context
	 * @param dummyworkflow_expenserequest
	 */
	public final void setDummyWorkflow_ExpenseRequest(com.mendix.systemwideinterfaces.core.IContext context, expenserequestexample.proxies.ExpenseRequest dummyworkflow_expenserequest)
	{
		if (dummyworkflow_expenserequest == null)
			getMendixObject().setValue(context, MemberNames.DummyWorkflow_ExpenseRequest.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DummyWorkflow_ExpenseRequest.toString(), dummyworkflow_expenserequest.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowcommonsunittests.proxies.DummyWorkflow that = (workflowcommonsunittests.proxies.DummyWorkflow) obj;
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
		return "WorkflowCommonsUnitTests.DummyWorkflow";
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