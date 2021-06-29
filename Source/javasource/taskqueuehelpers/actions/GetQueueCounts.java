// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package taskqueuehelpers.actions;

import java.util.HashMap;
import java.util.stream.Collectors;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import taskqueuehelpers.proxies.QueueCount;

/**
 * Creates a List of QueueCount entities grouped by queue name. The grouping will aggregate the open count and running count of each queue.
 */
public class GetQueueCounts extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.util.List<IMendixObject> __QueuedTasks;
	private java.util.List<system.proxies.QueuedTask> QueuedTasks;

	public GetQueueCounts(IContext context, java.util.List<IMendixObject> QueuedTasks)
	{
		super(context);
		this.__QueuedTasks = QueuedTasks;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		this.QueuedTasks = new java.util.ArrayList<system.proxies.QueuedTask>();
		if (__QueuedTasks != null)
			for (IMendixObject __QueuedTasksElement : __QueuedTasks)
				this.QueuedTasks.add(system.proxies.QueuedTask.initialize(getContext(), __QueuedTasksElement));

		// BEGIN USER CODE
		final IContext ctx = getContext();

		final HashMap<String, IMendixObject> map = new HashMap<>();

		for (system.proxies.QueuedTask queuedTask : QueuedTasks) {
			final String qname = queuedTask.getQueueName();

			final IMendixObject counts = map.computeIfAbsent(qname, key -> {
				final QueueCount newcounts = new QueueCount(ctx);
				newcounts.setQueueName(qname);
				return newcounts.getMendixObject();
			});

			final String xasId = queuedTask.getXASId();
			final String countAttr = xasId == null ? "OpenCount" : "RunningCount";
			final Long count = counts.getValue(ctx, countAttr);
			counts.setValue(ctx, countAttr, count + 1);

			map.put(qname, counts);
		}

		return map.values().stream().collect(Collectors.toList());
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GetQueueCounts";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}