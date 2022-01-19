// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package expenserequestexample.proxies;

public class ExpenseRequest
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject expenseRequestMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ExpenseRequestExample.ExpenseRequest";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Approved("Approved"),
		ApprovedSecondary("ApprovedSecondary"),
		Note("Note"),
		ExpenseRequest_Expense("ExpenseRequestExample.ExpenseRequest_Expense"),
		ExpenseRequestWorkflow_ExpenseRequest("ExpenseRequestExample.ExpenseRequestWorkflow_ExpenseRequest"),
		DummyWorkflow_ExpenseRequest("WorkflowCommonsUnitTests.DummyWorkflow_ExpenseRequest"),
		ExpenseRequest_UnitTestRunCreated("ExpenseRequestExample.ExpenseRequest_UnitTestRunCreated"),
		ExpenseRequest_UnitTestRunReadyForTesting("ExpenseRequestExample.ExpenseRequest_UnitTestRunReadyForTesting");

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

	public ExpenseRequest(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ExpenseRequestExample.ExpenseRequest"));
	}

	protected ExpenseRequest(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject expenseRequestMendixObject)
	{
		if (expenseRequestMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ExpenseRequestExample.ExpenseRequest", expenseRequestMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ExpenseRequestExample.ExpenseRequest");

		this.expenseRequestMendixObject = expenseRequestMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ExpenseRequest.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static expenserequestexample.proxies.ExpenseRequest initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return expenserequestexample.proxies.ExpenseRequest.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static expenserequestexample.proxies.ExpenseRequest initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new expenserequestexample.proxies.ExpenseRequest(context, mendixObject);
	}

	public static expenserequestexample.proxies.ExpenseRequest load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return expenserequestexample.proxies.ExpenseRequest.initialize(context, mendixObject);
	}

	public static java.util.List<expenserequestexample.proxies.ExpenseRequest> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<expenserequestexample.proxies.ExpenseRequest> result = new java.util.ArrayList<expenserequestexample.proxies.ExpenseRequest>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ExpenseRequestExample.ExpenseRequest" + xpathConstraint))
			result.add(expenserequestexample.proxies.ExpenseRequest.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Approved
	 */
	public final java.lang.Boolean getApproved()
	{
		return getApproved(getContext());
	}

	/**
	 * @param context
	 * @return value of Approved
	 */
	public final java.lang.Boolean getApproved(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Approved.toString());
	}

	/**
	 * Set value of Approved
	 * @param approved
	 */
	public final void setApproved(java.lang.Boolean approved)
	{
		setApproved(getContext(), approved);
	}

	/**
	 * Set value of Approved
	 * @param context
	 * @param approved
	 */
	public final void setApproved(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean approved)
	{
		getMendixObject().setValue(context, MemberNames.Approved.toString(), approved);
	}

	/**
	 * @return value of ApprovedSecondary
	 */
	public final java.lang.Boolean getApprovedSecondary()
	{
		return getApprovedSecondary(getContext());
	}

	/**
	 * @param context
	 * @return value of ApprovedSecondary
	 */
	public final java.lang.Boolean getApprovedSecondary(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ApprovedSecondary.toString());
	}

	/**
	 * Set value of ApprovedSecondary
	 * @param approvedsecondary
	 */
	public final void setApprovedSecondary(java.lang.Boolean approvedsecondary)
	{
		setApprovedSecondary(getContext(), approvedsecondary);
	}

	/**
	 * Set value of ApprovedSecondary
	 * @param context
	 * @param approvedsecondary
	 */
	public final void setApprovedSecondary(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean approvedsecondary)
	{
		getMendixObject().setValue(context, MemberNames.ApprovedSecondary.toString(), approvedsecondary);
	}

	/**
	 * @return value of Note
	 */
	public final java.lang.String getNote()
	{
		return getNote(getContext());
	}

	/**
	 * @param context
	 * @return value of Note
	 */
	public final java.lang.String getNote(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Note.toString());
	}

	/**
	 * Set value of Note
	 * @param note
	 */
	public final void setNote(java.lang.String note)
	{
		setNote(getContext(), note);
	}

	/**
	 * Set value of Note
	 * @param context
	 * @param note
	 */
	public final void setNote(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String note)
	{
		getMendixObject().setValue(context, MemberNames.Note.toString(), note);
	}

	/**
	 * @return value of ExpenseRequest_Expense
	 */
	public final expenserequestexample.proxies.Expense getExpenseRequest_Expense() throws com.mendix.core.CoreException
	{
		return getExpenseRequest_Expense(getContext());
	}

	/**
	 * @param context
	 * @return value of ExpenseRequest_Expense
	 */
	public final expenserequestexample.proxies.Expense getExpenseRequest_Expense(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		expenserequestexample.proxies.Expense result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ExpenseRequest_Expense.toString());
		if (identifier != null)
			result = expenserequestexample.proxies.Expense.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ExpenseRequest_Expense
	 * @param expenserequest_expense
	 */
	public final void setExpenseRequest_Expense(expenserequestexample.proxies.Expense expenserequest_expense)
	{
		setExpenseRequest_Expense(getContext(), expenserequest_expense);
	}

	/**
	 * Set value of ExpenseRequest_Expense
	 * @param context
	 * @param expenserequest_expense
	 */
	public final void setExpenseRequest_Expense(com.mendix.systemwideinterfaces.core.IContext context, expenserequestexample.proxies.Expense expenserequest_expense)
	{
		if (expenserequest_expense == null)
			getMendixObject().setValue(context, MemberNames.ExpenseRequest_Expense.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ExpenseRequest_Expense.toString(), expenserequest_expense.getMendixObject().getId());
	}

	/**
	 * @return value of ExpenseRequestWorkflow_ExpenseRequest
	 */
	public final expenserequestexample.proxies.ExpenseRequestWorkflow getExpenseRequestWorkflow_ExpenseRequest() throws com.mendix.core.CoreException
	{
		return getExpenseRequestWorkflow_ExpenseRequest(getContext());
	}

	/**
	 * @param context
	 * @return value of ExpenseRequestWorkflow_ExpenseRequest
	 */
	public final expenserequestexample.proxies.ExpenseRequestWorkflow getExpenseRequestWorkflow_ExpenseRequest(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		expenserequestexample.proxies.ExpenseRequestWorkflow result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ExpenseRequestWorkflow_ExpenseRequest.toString());
		if (identifier != null)
			result = expenserequestexample.proxies.ExpenseRequestWorkflow.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ExpenseRequestWorkflow_ExpenseRequest
	 * @param expenserequestworkflow_expenserequest
	 */
	public final void setExpenseRequestWorkflow_ExpenseRequest(expenserequestexample.proxies.ExpenseRequestWorkflow expenserequestworkflow_expenserequest)
	{
		setExpenseRequestWorkflow_ExpenseRequest(getContext(), expenserequestworkflow_expenserequest);
	}

	/**
	 * Set value of ExpenseRequestWorkflow_ExpenseRequest
	 * @param context
	 * @param expenserequestworkflow_expenserequest
	 */
	public final void setExpenseRequestWorkflow_ExpenseRequest(com.mendix.systemwideinterfaces.core.IContext context, expenserequestexample.proxies.ExpenseRequestWorkflow expenserequestworkflow_expenserequest)
	{
		if (expenserequestworkflow_expenserequest == null)
			getMendixObject().setValue(context, MemberNames.ExpenseRequestWorkflow_ExpenseRequest.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ExpenseRequestWorkflow_ExpenseRequest.toString(), expenserequestworkflow_expenserequest.getMendixObject().getId());
	}

	/**
	 * @return value of DummyWorkflow_ExpenseRequest
	 */
	public final workflowcommonsunittests.proxies.DummyWorkflow getDummyWorkflow_ExpenseRequest() throws com.mendix.core.CoreException
	{
		return getDummyWorkflow_ExpenseRequest(getContext());
	}

	/**
	 * @param context
	 * @return value of DummyWorkflow_ExpenseRequest
	 */
	public final workflowcommonsunittests.proxies.DummyWorkflow getDummyWorkflow_ExpenseRequest(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowcommonsunittests.proxies.DummyWorkflow result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DummyWorkflow_ExpenseRequest.toString());
		if (identifier != null)
			result = workflowcommonsunittests.proxies.DummyWorkflow.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DummyWorkflow_ExpenseRequest
	 * @param dummyworkflow_expenserequest
	 */
	public final void setDummyWorkflow_ExpenseRequest(workflowcommonsunittests.proxies.DummyWorkflow dummyworkflow_expenserequest)
	{
		setDummyWorkflow_ExpenseRequest(getContext(), dummyworkflow_expenserequest);
	}

	/**
	 * Set value of DummyWorkflow_ExpenseRequest
	 * @param context
	 * @param dummyworkflow_expenserequest
	 */
	public final void setDummyWorkflow_ExpenseRequest(com.mendix.systemwideinterfaces.core.IContext context, workflowcommonsunittests.proxies.DummyWorkflow dummyworkflow_expenserequest)
	{
		if (dummyworkflow_expenserequest == null)
			getMendixObject().setValue(context, MemberNames.DummyWorkflow_ExpenseRequest.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DummyWorkflow_ExpenseRequest.toString(), dummyworkflow_expenserequest.getMendixObject().getId());
	}

	/**
	 * @return value of ExpenseRequest_UnitTestRunCreated
	 */
	public final workflowcommonsunittests.proxies.UnitTestRun getExpenseRequest_UnitTestRunCreated() throws com.mendix.core.CoreException
	{
		return getExpenseRequest_UnitTestRunCreated(getContext());
	}

	/**
	 * @param context
	 * @return value of ExpenseRequest_UnitTestRunCreated
	 */
	public final workflowcommonsunittests.proxies.UnitTestRun getExpenseRequest_UnitTestRunCreated(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowcommonsunittests.proxies.UnitTestRun result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ExpenseRequest_UnitTestRunCreated.toString());
		if (identifier != null)
			result = workflowcommonsunittests.proxies.UnitTestRun.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ExpenseRequest_UnitTestRunCreated
	 * @param expenserequest_unittestruncreated
	 */
	public final void setExpenseRequest_UnitTestRunCreated(workflowcommonsunittests.proxies.UnitTestRun expenserequest_unittestruncreated)
	{
		setExpenseRequest_UnitTestRunCreated(getContext(), expenserequest_unittestruncreated);
	}

	/**
	 * Set value of ExpenseRequest_UnitTestRunCreated
	 * @param context
	 * @param expenserequest_unittestruncreated
	 */
	public final void setExpenseRequest_UnitTestRunCreated(com.mendix.systemwideinterfaces.core.IContext context, workflowcommonsunittests.proxies.UnitTestRun expenserequest_unittestruncreated)
	{
		if (expenserequest_unittestruncreated == null)
			getMendixObject().setValue(context, MemberNames.ExpenseRequest_UnitTestRunCreated.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ExpenseRequest_UnitTestRunCreated.toString(), expenserequest_unittestruncreated.getMendixObject().getId());
	}

	/**
	 * @return value of ExpenseRequest_UnitTestRunReadyForTesting
	 */
	public final workflowcommonsunittests.proxies.UnitTestRun getExpenseRequest_UnitTestRunReadyForTesting() throws com.mendix.core.CoreException
	{
		return getExpenseRequest_UnitTestRunReadyForTesting(getContext());
	}

	/**
	 * @param context
	 * @return value of ExpenseRequest_UnitTestRunReadyForTesting
	 */
	public final workflowcommonsunittests.proxies.UnitTestRun getExpenseRequest_UnitTestRunReadyForTesting(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowcommonsunittests.proxies.UnitTestRun result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ExpenseRequest_UnitTestRunReadyForTesting.toString());
		if (identifier != null)
			result = workflowcommonsunittests.proxies.UnitTestRun.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ExpenseRequest_UnitTestRunReadyForTesting
	 * @param expenserequest_unittestrunreadyfortesting
	 */
	public final void setExpenseRequest_UnitTestRunReadyForTesting(workflowcommonsunittests.proxies.UnitTestRun expenserequest_unittestrunreadyfortesting)
	{
		setExpenseRequest_UnitTestRunReadyForTesting(getContext(), expenserequest_unittestrunreadyfortesting);
	}

	/**
	 * Set value of ExpenseRequest_UnitTestRunReadyForTesting
	 * @param context
	 * @param expenserequest_unittestrunreadyfortesting
	 */
	public final void setExpenseRequest_UnitTestRunReadyForTesting(com.mendix.systemwideinterfaces.core.IContext context, workflowcommonsunittests.proxies.UnitTestRun expenserequest_unittestrunreadyfortesting)
	{
		if (expenserequest_unittestrunreadyfortesting == null)
			getMendixObject().setValue(context, MemberNames.ExpenseRequest_UnitTestRunReadyForTesting.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ExpenseRequest_UnitTestRunReadyForTesting.toString(), expenserequest_unittestrunreadyfortesting.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return expenseRequestMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final expenserequestexample.proxies.ExpenseRequest that = (expenserequestexample.proxies.ExpenseRequest) obj;
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
		return "ExpenseRequestExample.ExpenseRequest";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}