// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowcommons.proxies;

public class WorkflowView implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject workflowViewMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowCommons.WorkflowView";

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
		State("State"),
		Reason("Reason"),
		WorkflowView_Workflow("WorkflowCommons.WorkflowView_Workflow"),
		WorkflowView_Initiator("WorkflowCommons.WorkflowView_Initiator"),
		WorkflowView_WorkflowDefinition("WorkflowCommons.WorkflowView_WorkflowDefinition");

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

	public WorkflowView(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected WorkflowView(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject workflowViewMendixObject)
	{
		if (workflowViewMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, workflowViewMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.workflowViewMendixObject = workflowViewMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static workflowcommons.proxies.WorkflowView initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowcommons.proxies.WorkflowView(context, mendixObject);
	}

	public static workflowcommons.proxies.WorkflowView load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowcommons.proxies.WorkflowView.initialize(context, mendixObject);
	}

	public static java.util.List<workflowcommons.proxies.WorkflowView> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> workflowcommons.proxies.WorkflowView.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of StartTime
	 */
	public final java.util.Date getStartTime()
	{
		return getStartTime(getContext());
	}

	/**
	 * @param context
	 * @return value of StartTime
	 */
	public final java.util.Date getStartTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartTime.toString());
	}

	/**
	 * Set value of StartTime
	 * @param starttime
	 */
	public final void setStartTime(java.util.Date starttime)
	{
		setStartTime(getContext(), starttime);
	}

	/**
	 * Set value of StartTime
	 * @param context
	 * @param starttime
	 */
	public final void setStartTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date starttime)
	{
		getMendixObject().setValue(context, MemberNames.StartTime.toString(), starttime);
	}

	/**
	 * @return value of EndTime
	 */
	public final java.util.Date getEndTime()
	{
		return getEndTime(getContext());
	}

	/**
	 * @param context
	 * @return value of EndTime
	 */
	public final java.util.Date getEndTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndTime.toString());
	}

	/**
	 * Set value of EndTime
	 * @param endtime
	 */
	public final void setEndTime(java.util.Date endtime)
	{
		setEndTime(getContext(), endtime);
	}

	/**
	 * Set value of EndTime
	 * @param context
	 * @param endtime
	 */
	public final void setEndTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date endtime)
	{
		getMendixObject().setValue(context, MemberNames.EndTime.toString(), endtime);
	}

	/**
	 * @return value of DueDate
	 */
	public final java.util.Date getDueDate()
	{
		return getDueDate(getContext());
	}

	/**
	 * @param context
	 * @return value of DueDate
	 */
	public final java.util.Date getDueDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DueDate.toString());
	}

	/**
	 * Set value of DueDate
	 * @param duedate
	 */
	public final void setDueDate(java.util.Date duedate)
	{
		setDueDate(getContext(), duedate);
	}

	/**
	 * Set value of DueDate
	 * @param context
	 * @param duedate
	 */
	public final void setDueDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date duedate)
	{
		getMendixObject().setValue(context, MemberNames.DueDate.toString(), duedate);
	}

	/**
	 * Get value of State
	 * @param state
	 */
	public final system.proxies.WorkflowState getState()
	{
		return getState(getContext());
	}

	/**
	 * @param context
	 * @return value of State
	 */
	public final system.proxies.WorkflowState getState(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.State.toString());
		if (obj == null) {
			return null;
		}
		return system.proxies.WorkflowState.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of State
	 * @param state
	 */
	public final void setState(system.proxies.WorkflowState state)
	{
		setState(getContext(), state);
	}

	/**
	 * Set value of State
	 * @param context
	 * @param state
	 */
	public final void setState(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowState state)
	{
		if (state != null) {
			getMendixObject().setValue(context, MemberNames.State.toString(), state.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.State.toString(), null);
		}
	}

	/**
	 * @return value of Reason
	 */
	public final java.lang.String getReason()
	{
		return getReason(getContext());
	}

	/**
	 * @param context
	 * @return value of Reason
	 */
	public final java.lang.String getReason(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Reason.toString());
	}

	/**
	 * Set value of Reason
	 * @param reason
	 */
	public final void setReason(java.lang.String reason)
	{
		setReason(getContext(), reason);
	}

	/**
	 * Set value of Reason
	 * @param context
	 * @param reason
	 */
	public final void setReason(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String reason)
	{
		getMendixObject().setValue(context, MemberNames.Reason.toString(), reason);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkflowView_Workflow
	 */
	public final system.proxies.Workflow getWorkflowView_Workflow() throws com.mendix.core.CoreException
	{
		return getWorkflowView_Workflow(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowView_Workflow
	 * @throws com.mendix.core.CoreException
	 */
	public final system.proxies.Workflow getWorkflowView_Workflow(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.Workflow result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowView_Workflow.toString());
		if (identifier != null) {
			result = system.proxies.Workflow.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WorkflowView_Workflow
	 * @param workflowview_workflow
	 */
	public final void setWorkflowView_Workflow(system.proxies.Workflow workflowview_workflow)
	{
		setWorkflowView_Workflow(getContext(), workflowview_workflow);
	}

	/**
	 * Set value of WorkflowView_Workflow
	 * @param context
	 * @param workflowview_workflow
	 */
	public final void setWorkflowView_Workflow(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.Workflow workflowview_workflow)
	{
		if (workflowview_workflow == null) {
			getMendixObject().setValue(context, MemberNames.WorkflowView_Workflow.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WorkflowView_Workflow.toString(), workflowview_workflow.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkflowView_Initiator
	 */
	public final system.proxies.User getWorkflowView_Initiator() throws com.mendix.core.CoreException
	{
		return getWorkflowView_Initiator(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowView_Initiator
	 * @throws com.mendix.core.CoreException
	 */
	public final system.proxies.User getWorkflowView_Initiator(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.User result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowView_Initiator.toString());
		if (identifier != null) {
			result = system.proxies.User.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WorkflowView_Initiator
	 * @param workflowview_initiator
	 */
	public final void setWorkflowView_Initiator(system.proxies.User workflowview_initiator)
	{
		setWorkflowView_Initiator(getContext(), workflowview_initiator);
	}

	/**
	 * Set value of WorkflowView_Initiator
	 * @param context
	 * @param workflowview_initiator
	 */
	public final void setWorkflowView_Initiator(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.User workflowview_initiator)
	{
		if (workflowview_initiator == null) {
			getMendixObject().setValue(context, MemberNames.WorkflowView_Initiator.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WorkflowView_Initiator.toString(), workflowview_initiator.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkflowView_WorkflowDefinition
	 */
	public final system.proxies.WorkflowDefinition getWorkflowView_WorkflowDefinition() throws com.mendix.core.CoreException
	{
		return getWorkflowView_WorkflowDefinition(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowView_WorkflowDefinition
	 * @throws com.mendix.core.CoreException
	 */
	public final system.proxies.WorkflowDefinition getWorkflowView_WorkflowDefinition(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.WorkflowDefinition result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowView_WorkflowDefinition.toString());
		if (identifier != null) {
			result = system.proxies.WorkflowDefinition.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WorkflowView_WorkflowDefinition
	 * @param workflowview_workflowdefinition
	 */
	public final void setWorkflowView_WorkflowDefinition(system.proxies.WorkflowDefinition workflowview_workflowdefinition)
	{
		setWorkflowView_WorkflowDefinition(getContext(), workflowview_workflowdefinition);
	}

	/**
	 * Set value of WorkflowView_WorkflowDefinition
	 * @param context
	 * @param workflowview_workflowdefinition
	 */
	public final void setWorkflowView_WorkflowDefinition(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowDefinition workflowview_workflowdefinition)
	{
		if (workflowview_workflowdefinition == null) {
			getMendixObject().setValue(context, MemberNames.WorkflowView_WorkflowDefinition.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WorkflowView_WorkflowDefinition.toString(), workflowview_workflowdefinition.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return workflowViewMendixObject;
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
			final workflowcommons.proxies.WorkflowView that = (workflowcommons.proxies.WorkflowView) obj;
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
