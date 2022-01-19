// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowcommons.proxies;

public class TaskCount
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject taskCountMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowCommons.TaskCount";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		MyOpenTaskCount("MyOpenTaskCount"),
		AllOpenTaskCount("AllOpenTaskCount"),
		UnassignedTaskCount("UnassignedTaskCount");

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

	public TaskCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowCommons.TaskCount"));
	}

	protected TaskCount(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject taskCountMendixObject)
	{
		if (taskCountMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("WorkflowCommons.TaskCount", taskCountMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowCommons.TaskCount");

		this.taskCountMendixObject = taskCountMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TaskCount.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static workflowcommons.proxies.TaskCount initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowcommons.proxies.TaskCount.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowcommons.proxies.TaskCount initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowcommons.proxies.TaskCount(context, mendixObject);
	}

	public static workflowcommons.proxies.TaskCount load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowcommons.proxies.TaskCount.initialize(context, mendixObject);
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
	 * @return value of MyOpenTaskCount
	 */
	public final java.lang.Integer getMyOpenTaskCount()
	{
		return getMyOpenTaskCount(getContext());
	}

	/**
	 * @param context
	 * @return value of MyOpenTaskCount
	 */
	public final java.lang.Integer getMyOpenTaskCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MyOpenTaskCount.toString());
	}

	/**
	 * Set value of MyOpenTaskCount
	 * @param myopentaskcount
	 */
	public final void setMyOpenTaskCount(java.lang.Integer myopentaskcount)
	{
		setMyOpenTaskCount(getContext(), myopentaskcount);
	}

	/**
	 * Set value of MyOpenTaskCount
	 * @param context
	 * @param myopentaskcount
	 */
	public final void setMyOpenTaskCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer myopentaskcount)
	{
		getMendixObject().setValue(context, MemberNames.MyOpenTaskCount.toString(), myopentaskcount);
	}

	/**
	 * @return value of AllOpenTaskCount
	 */
	public final java.lang.Integer getAllOpenTaskCount()
	{
		return getAllOpenTaskCount(getContext());
	}

	/**
	 * @param context
	 * @return value of AllOpenTaskCount
	 */
	public final java.lang.Integer getAllOpenTaskCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.AllOpenTaskCount.toString());
	}

	/**
	 * Set value of AllOpenTaskCount
	 * @param allopentaskcount
	 */
	public final void setAllOpenTaskCount(java.lang.Integer allopentaskcount)
	{
		setAllOpenTaskCount(getContext(), allopentaskcount);
	}

	/**
	 * Set value of AllOpenTaskCount
	 * @param context
	 * @param allopentaskcount
	 */
	public final void setAllOpenTaskCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer allopentaskcount)
	{
		getMendixObject().setValue(context, MemberNames.AllOpenTaskCount.toString(), allopentaskcount);
	}

	/**
	 * @return value of UnassignedTaskCount
	 */
	public final java.lang.Integer getUnassignedTaskCount()
	{
		return getUnassignedTaskCount(getContext());
	}

	/**
	 * @param context
	 * @return value of UnassignedTaskCount
	 */
	public final java.lang.Integer getUnassignedTaskCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.UnassignedTaskCount.toString());
	}

	/**
	 * Set value of UnassignedTaskCount
	 * @param unassignedtaskcount
	 */
	public final void setUnassignedTaskCount(java.lang.Integer unassignedtaskcount)
	{
		setUnassignedTaskCount(getContext(), unassignedtaskcount);
	}

	/**
	 * Set value of UnassignedTaskCount
	 * @param context
	 * @param unassignedtaskcount
	 */
	public final void setUnassignedTaskCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer unassignedtaskcount)
	{
		getMendixObject().setValue(context, MemberNames.UnassignedTaskCount.toString(), unassignedtaskcount);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return taskCountMendixObject;
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
			final workflowcommons.proxies.TaskCount that = (workflowcommons.proxies.TaskCount) obj;
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
		return "WorkflowCommons.TaskCount";
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
