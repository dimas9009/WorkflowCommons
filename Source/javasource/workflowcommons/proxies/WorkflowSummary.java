// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowcommons.proxies;

public class WorkflowSummary implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject workflowSummaryMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowCommons.WorkflowSummary";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		NumberOfWorkflowsInProgress("NumberOfWorkflowsInProgress"),
		NumberOfWorkflowOverdue("NumberOfWorkflowOverdue"),
		NumberOfWorkflowsCompleted("NumberOfWorkflowsCompleted"),
		IsLocked("IsLocked"),
		DashboardContext_WorkflowSummary("WorkflowCommons.DashboardContext_WorkflowSummary"),
		WorkflowSummary_WorkflowDefinition("WorkflowCommons.WorkflowSummary_WorkflowDefinition");

		private final java.lang.String metaName;

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

	public WorkflowSummary(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected WorkflowSummary(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject workflowSummaryMendixObject)
	{
		if (workflowSummaryMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, workflowSummaryMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.workflowSummaryMendixObject = workflowSummaryMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static workflowcommons.proxies.WorkflowSummary initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowcommons.proxies.WorkflowSummary(context, mendixObject);
	}

	public static workflowcommons.proxies.WorkflowSummary load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowcommons.proxies.WorkflowSummary.initialize(context, mendixObject);
	}

	/**
	 * @return value of NumberOfWorkflowsInProgress
	 */
	public final java.lang.Integer getNumberOfWorkflowsInProgress()
	{
		return getNumberOfWorkflowsInProgress(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberOfWorkflowsInProgress
	 */
	public final java.lang.Integer getNumberOfWorkflowsInProgress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NumberOfWorkflowsInProgress.toString());
	}

	/**
	 * Set value of NumberOfWorkflowsInProgress
	 * @param numberofworkflowsinprogress
	 */
	public final void setNumberOfWorkflowsInProgress(java.lang.Integer numberofworkflowsinprogress)
	{
		setNumberOfWorkflowsInProgress(getContext(), numberofworkflowsinprogress);
	}

	/**
	 * Set value of NumberOfWorkflowsInProgress
	 * @param context
	 * @param numberofworkflowsinprogress
	 */
	public final void setNumberOfWorkflowsInProgress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer numberofworkflowsinprogress)
	{
		getMendixObject().setValue(context, MemberNames.NumberOfWorkflowsInProgress.toString(), numberofworkflowsinprogress);
	}

	/**
	 * @return value of NumberOfWorkflowOverdue
	 */
	public final java.lang.Integer getNumberOfWorkflowOverdue()
	{
		return getNumberOfWorkflowOverdue(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberOfWorkflowOverdue
	 */
	public final java.lang.Integer getNumberOfWorkflowOverdue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NumberOfWorkflowOverdue.toString());
	}

	/**
	 * Set value of NumberOfWorkflowOverdue
	 * @param numberofworkflowoverdue
	 */
	public final void setNumberOfWorkflowOverdue(java.lang.Integer numberofworkflowoverdue)
	{
		setNumberOfWorkflowOverdue(getContext(), numberofworkflowoverdue);
	}

	/**
	 * Set value of NumberOfWorkflowOverdue
	 * @param context
	 * @param numberofworkflowoverdue
	 */
	public final void setNumberOfWorkflowOverdue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer numberofworkflowoverdue)
	{
		getMendixObject().setValue(context, MemberNames.NumberOfWorkflowOverdue.toString(), numberofworkflowoverdue);
	}

	/**
	 * @return value of NumberOfWorkflowsCompleted
	 */
	public final java.lang.Integer getNumberOfWorkflowsCompleted()
	{
		return getNumberOfWorkflowsCompleted(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberOfWorkflowsCompleted
	 */
	public final java.lang.Integer getNumberOfWorkflowsCompleted(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NumberOfWorkflowsCompleted.toString());
	}

	/**
	 * Set value of NumberOfWorkflowsCompleted
	 * @param numberofworkflowscompleted
	 */
	public final void setNumberOfWorkflowsCompleted(java.lang.Integer numberofworkflowscompleted)
	{
		setNumberOfWorkflowsCompleted(getContext(), numberofworkflowscompleted);
	}

	/**
	 * Set value of NumberOfWorkflowsCompleted
	 * @param context
	 * @param numberofworkflowscompleted
	 */
	public final void setNumberOfWorkflowsCompleted(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer numberofworkflowscompleted)
	{
		getMendixObject().setValue(context, MemberNames.NumberOfWorkflowsCompleted.toString(), numberofworkflowscompleted);
	}

	/**
	 * @return value of IsLocked
	 */
	public final java.lang.Boolean getIsLocked()
	{
		return getIsLocked(getContext());
	}

	/**
	 * @param context
	 * @return value of IsLocked
	 */
	public final java.lang.Boolean getIsLocked(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsLocked.toString());
	}

	/**
	 * Set value of IsLocked
	 * @param islocked
	 */
	public final void setIsLocked(java.lang.Boolean islocked)
	{
		setIsLocked(getContext(), islocked);
	}

	/**
	 * Set value of IsLocked
	 * @param context
	 * @param islocked
	 */
	public final void setIsLocked(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean islocked)
	{
		getMendixObject().setValue(context, MemberNames.IsLocked.toString(), islocked);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of DashboardContext_WorkflowSummary
	 */
	public final workflowcommons.proxies.DashboardContext getDashboardContext_WorkflowSummary() throws com.mendix.core.CoreException
	{
		return getDashboardContext_WorkflowSummary(getContext());
	}

	/**
	 * @param context
	 * @return value of DashboardContext_WorkflowSummary
	 * @throws com.mendix.core.CoreException
	 */
	public final workflowcommons.proxies.DashboardContext getDashboardContext_WorkflowSummary(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowcommons.proxies.DashboardContext result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DashboardContext_WorkflowSummary.toString());
		if (identifier != null) {
			result = workflowcommons.proxies.DashboardContext.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of DashboardContext_WorkflowSummary
	 * @param dashboardcontext_workflowsummary
	 */
	public final void setDashboardContext_WorkflowSummary(workflowcommons.proxies.DashboardContext dashboardcontext_workflowsummary)
	{
		setDashboardContext_WorkflowSummary(getContext(), dashboardcontext_workflowsummary);
	}

	/**
	 * Set value of DashboardContext_WorkflowSummary
	 * @param context
	 * @param dashboardcontext_workflowsummary
	 */
	public final void setDashboardContext_WorkflowSummary(com.mendix.systemwideinterfaces.core.IContext context, workflowcommons.proxies.DashboardContext dashboardcontext_workflowsummary)
	{
		if (dashboardcontext_workflowsummary == null) {
			getMendixObject().setValue(context, MemberNames.DashboardContext_WorkflowSummary.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.DashboardContext_WorkflowSummary.toString(), dashboardcontext_workflowsummary.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkflowSummary_WorkflowDefinition
	 */
	public final system.proxies.WorkflowDefinition getWorkflowSummary_WorkflowDefinition() throws com.mendix.core.CoreException
	{
		return getWorkflowSummary_WorkflowDefinition(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowSummary_WorkflowDefinition
	 * @throws com.mendix.core.CoreException
	 */
	public final system.proxies.WorkflowDefinition getWorkflowSummary_WorkflowDefinition(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.WorkflowDefinition result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowSummary_WorkflowDefinition.toString());
		if (identifier != null) {
			result = system.proxies.WorkflowDefinition.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WorkflowSummary_WorkflowDefinition
	 * @param workflowsummary_workflowdefinition
	 */
	public final void setWorkflowSummary_WorkflowDefinition(system.proxies.WorkflowDefinition workflowsummary_workflowdefinition)
	{
		setWorkflowSummary_WorkflowDefinition(getContext(), workflowsummary_workflowdefinition);
	}

	/**
	 * Set value of WorkflowSummary_WorkflowDefinition
	 * @param context
	 * @param workflowsummary_workflowdefinition
	 */
	public final void setWorkflowSummary_WorkflowDefinition(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowDefinition workflowsummary_workflowdefinition)
	{
		if (workflowsummary_workflowdefinition == null) {
			getMendixObject().setValue(context, MemberNames.WorkflowSummary_WorkflowDefinition.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WorkflowSummary_WorkflowDefinition.toString(), workflowsummary_workflowdefinition.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return workflowSummaryMendixObject;
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowcommons.proxies.WorkflowSummary that = (workflowcommons.proxies.WorkflowSummary) obj;
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
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
