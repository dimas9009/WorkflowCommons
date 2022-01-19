// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowcommonsunittests.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the WorkflowCommonsUnitTests module
	public static void aCT_ExecuteAllWFCommonsUnitTests(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("WorkflowCommonsUnitTests.ACT_ExecuteAllWFCommonsUnitTests").withParams(params).execute(context);
	}
	public static void createAndStartDummyWorkflow(IContext context, java.lang.String _action, workflowcommonsunittests.proxies.UnitTestRun _unitTestRun)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Action", _action);
		params.put("UnitTestRun", _unitTestRun == null ? null : _unitTestRun.getMendixObject());
		Core.microflowCall("WorkflowCommonsUnitTests.CreateAndStartDummyWorkflow").withParams(params).execute(context);
	}
	public static void createAndStartExpenseRequestWorkflow(IContext context, java.lang.String _action, workflowcommonsunittests.proxies.UnitTestRun _unitTestRun)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Action", _action);
		params.put("UnitTestRun", _unitTestRun == null ? null : _unitTestRun.getMendixObject());
		Core.microflowCall("WorkflowCommonsUnitTests.CreateAndStartExpenseRequestWorkflow").withParams(params).execute(context);
	}
	public static void createDemoUsersForUnitTest(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("WorkflowCommonsUnitTests.CreateDemoUsersForUnitTest").withParams(params).execute(context);
	}
	public static java.util.List<unittesting.proxies.UnitTest> dS_TestSuite_GetFailedUnitTests(IContext context, unittesting.proxies.TestSuite _testSuite)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestSuite", _testSuite == null ? null : _testSuite.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("WorkflowCommonsUnitTests.DS_TestSuite_GetFailedUnitTests").withParams(params).execute(context);
		java.util.List<unittesting.proxies.UnitTest> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(unittesting.proxies.UnitTest.initialize(context, obj));
		}
		return result;
	}
	public static void pRS_InitiateUnitTests(IContext context, system.proxies.HttpRequest _httpRequest, system.proxies.HttpResponse _httpResponse)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("httpRequest", _httpRequest == null ? null : _httpRequest.getMendixObject());
		params.put("httpResponse", _httpResponse == null ? null : _httpResponse.getMendixObject());
		Core.microflowCall("WorkflowCommonsUnitTests.PRS_InitiateUnitTests").withParams(params).execute(context);
	}
	public static unittesting.proxies.TestSuite pRS_PollUnitTestResults(IContext context, system.proxies.HttpRequest _httpRequest, system.proxies.HttpResponse _httpResponse)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("httpRequest", _httpRequest == null ? null : _httpRequest.getMendixObject());
		params.put("httpResponse", _httpResponse == null ? null : _httpResponse.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("WorkflowCommonsUnitTests.PRS_PollUnitTestResults").withParams(params).execute(context);
		return result == null ? null : unittesting.proxies.TestSuite.initialize(context, result);
	}
	public static void setup_CleanUp(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("WorkflowCommonsUnitTests.Setup_CleanUp").withParams(params).execute(context);
	}
	public static void setup_Workflows(IContext context, workflowcommonsunittests.proxies.UnitTestRun _unitTestRun, java.lang.String _action, java.lang.Long _amount)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("UnitTestRun", _unitTestRun == null ? null : _unitTestRun.getMendixObject());
		params.put("Action", _action);
		params.put("Amount", _amount);
		Core.microflowCall("WorkflowCommonsUnitTests.Setup_Workflows").withParams(params).execute(context);
	}
	public static workflowcommons.proxies.DashboardContext sUB_DashboardContext_ForDummyWorkflow(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("WorkflowCommonsUnitTests.SUB_DashboardContext_ForDummyWorkflow").withParams(params).execute(context);
		return result == null ? null : workflowcommons.proxies.DashboardContext.initialize(context, result);
	}
	public static void sUB_DummyWorkflow_CompleteTask(IContext context, system.proxies.WorkflowUserTask _workflowUserTask)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowUserTask", _workflowUserTask == null ? null : _workflowUserTask.getMendixObject());
		Core.microflowCall("WorkflowCommonsUnitTests.SUB_DummyWorkflow_CompleteTask").withParams(params).execute(context);
	}
	public static void sUB_ExecuteAllWFCommonsUnitTests(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("WorkflowCommonsUnitTests.SUB_ExecuteAllWFCommonsUnitTests").withParams(params).execute(context);
	}
	public static void sUB_ExpenseRequestWorkflow_CompleteTask(IContext context, system.proxies.WorkflowUserTask _workflowUserTask)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowUserTask", _workflowUserTask == null ? null : _workflowUserTask.getMendixObject());
		Core.microflowCall("WorkflowCommonsUnitTests.SUB_ExpenseRequestWorkflow_CompleteTask").withParams(params).execute(context);
	}
	public static unittesting.proxies.TestSuite sUB_RetrieveTestSuite(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("WorkflowCommonsUnitTests.SUB_RetrieveTestSuite").withParams(params).execute(context);
		return result == null ? null : unittesting.proxies.TestSuite.initialize(context, result);
	}
	public static void tASK_CompleteUserTask(IContext context, system.proxies.Workflow _workflow, expenserequestexample.proxies.Expense _expense)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Workflow", _workflow == null ? null : _workflow.getMendixObject());
		params.put("Expense", _expense == null ? null : _expense.getMendixObject());
		Core.microflowCall("WorkflowCommonsUnitTests.TASK_CompleteUserTask").withParams(params).execute(context);
	}
	public static void tASK_ExpenseRequest_UnitTestRun_UpdateAndExecuteUnitTestsWhenAllSetup(IContext context, expenserequestexample.proxies.ExpenseRequest _expenseRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ExpenseRequest", _expenseRequest == null ? null : _expenseRequest.getMendixObject());
		Core.microflowCall("WorkflowCommonsUnitTests.TASK_ExpenseRequest_UnitTestRun_UpdateAndExecuteUnitTestsWhenAllSetup").withParams(params).execute(context);
	}
	public static void tASK_StartDummyWorkflowForUnitTest(IContext context, expenserequestexample.proxies.ExpenseRequest _expenseRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ExpenseRequest", _expenseRequest == null ? null : _expenseRequest.getMendixObject());
		Core.microflowCall("WorkflowCommonsUnitTests.TASK_StartDummyWorkflowForUnitTest").withParams(params).execute(context);
	}
	public static void tASK_StartExpenseRequestWorkflowForUnitTest(IContext context, expenserequestexample.proxies.ExpenseRequest _expenseRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ExpenseRequest", _expenseRequest == null ? null : _expenseRequest.getMendixObject());
		Core.microflowCall("WorkflowCommonsUnitTests.TASK_StartExpenseRequestWorkflowForUnitTest").withParams(params).execute(context);
	}
	public static void tASK_WorkflowUserTask_ExecuteFollowupActions(IContext context, expenserequestexample.proxies.ExpenseRequest _expenseRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ExpenseRequest", _expenseRequest == null ? null : _expenseRequest.getMendixObject());
		Core.microflowCall("WorkflowCommonsUnitTests.TASK_WorkflowUserTask_ExecuteFollowupActions").withParams(params).execute(context);
	}
	public static void teardown(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("WorkflowCommonsUnitTests.Teardown").withParams(params).execute(context);
	}
	public static void unitTestRun_UpdateAndExecuteUnitTestsWhenAllSetup(IContext context, expenserequestexample.proxies.ExpenseRequest _expenseRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ExpenseRequest", _expenseRequest == null ? null : _expenseRequest.getMendixObject());
		Core.microflowCall("WorkflowCommonsUnitTests.UnitTestRun_UpdateAndExecuteUnitTestsWhenAllSetup").withParams(params).execute(context);
	}
	public static boolean uT_Workflow_WorkflowAttachmentAdd(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_Workflow_WorkflowAttachmentAdd").withParams(params).execute(context);
	}
	public static boolean uT_Workflow_WorkflowCommentAdd(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_Workflow_WorkflowCommentAdd").withParams(params).execute(context);
	}
	public static boolean uT_Workflow_WorkflowCommentRemove(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_Workflow_WorkflowCommentRemove").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_CountFailedUserTasks(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_CountFailedUserTasks").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_CountFailedUserTasksForDummyWorkflow(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_CountFailedUserTasksForDummyWorkflow").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_CountInProgressUserTasks(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_CountInProgressUserTasks").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_CountInProgressUserTasksForDummyWorkflow(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_CountInProgressUserTasksForDummyWorkflow").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_CountInProgressWorkflows(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_CountInProgressWorkflows").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_CountInProgressWorkflowsForDummyWorkflow(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_CountInProgressWorkflowsForDummyWorkflow").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_CountOverdueUserTasks(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_CountOverdueUserTasks").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_CountOverdueUserTasksForDummyWorkflow(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_CountOverdueUserTasksForDummyWorkflow").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_CountOverdueWorkflows(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_CountOverdueWorkflows").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_CountOverdueWorkflowsForDummyWorkflow(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_CountOverdueWorkflowsForDummyWorkflow").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_RetrieveOrCreateDashboardContext(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_RetrieveOrCreateDashboardContext").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_RetrieveOrCreateTaskSummary(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_RetrieveOrCreateTaskSummary").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_RetrieveOrCreateTaskSummaryForDummyWorkflow(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_RetrieveOrCreateTaskSummaryForDummyWorkflow").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_RetrieveOrCreateWorkflowSummary(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_RetrieveOrCreateWorkflowSummary").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_RetrieveOrCreateWorkflowSummaryForDummyWorkflow(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_RetrieveOrCreateWorkflowSummaryForDummyWorkflow").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_TaskSummaryCreateOrUpdateAdmin(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_TaskSummaryCreateOrUpdateAdmin").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_TaskSummaryCreateOrUpdateAdminForDummyWorkflow(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_TaskSummaryCreateOrUpdateAdminForDummyWorkflow").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_TestUpdateSettingsDefault(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_TestUpdateSettingsDefault").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_WorkflowSummaryCreateOrUpdate(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_WorkflowSummaryCreateOrUpdate").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowDashboard_WorkflowSummaryCreateOrUpdateForDummyWorkflow(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowDashboard_WorkflowSummaryCreateOrUpdateForDummyWorkflow").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowUserTask_AssignToNoneTargettedUser(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowUserTask_AssignToNoneTargettedUser").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowUserTask_AssignToUser(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowUserTask_AssignToUser").withParams(params).execute(context);
	}
	public static boolean uT_WorkflowUserTask_UnAssignFromUser(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_WorkflowUserTask_UnAssignFromUser").withParams(params).execute(context);
	}
	public static boolean uT_ZWorkflow_AbortIncompatibleWorkflow(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_ZWorkflow_AbortIncompatibleWorkflow").withParams(params).execute(context);
	}
	public static boolean uT_ZWorkflow_AbortInProgressWorkflow(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_ZWorkflow_AbortInProgressWorkflow").withParams(params).execute(context);
	}
	public static boolean uT_ZWorkflow_ContinueIncompatibleWorkflow(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_ZWorkflow_ContinueIncompatibleWorkflow").withParams(params).execute(context);
	}
	public static boolean uT_ZWorkflow_PauseInProgressWorkflow(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_ZWorkflow_PauseInProgressWorkflow").withParams(params).execute(context);
	}
	public static boolean uT_ZWorkflow_RestartIncompatibleWorkflow(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_ZWorkflow_RestartIncompatibleWorkflow").withParams(params).execute(context);
	}
	public static boolean uT_ZWorkflow_ResumePausedWorkflow(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.UT_ZWorkflow_ResumePausedWorkflow").withParams(params).execute(context);
	}
	public static boolean wFS_DummySystemTask(IContext context, expenserequestexample.proxies.ExpenseRequest _expenseRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ExpenseRequest", _expenseRequest == null ? null : _expenseRequest.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.WFS_DummySystemTask").withParams(params).execute(context);
	}
	public static void workflow_MarkIncompatible(IContext context, system.proxies.Workflow _workflow)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Workflow", _workflow == null ? null : _workflow.getMendixObject());
		Core.microflowCall("WorkflowCommonsUnitTests.Workflow_MarkIncompatible").withParams(params).execute(context);
	}
	public static boolean workflowUserTask_HasExpectedState(IContext context, system.proxies.WorkflowUserTask _workflowUserTask, system.proxies.WorkflowUserTaskState _expectedWorkflowTaskState, java.lang.String _messagePrefix)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("WorkflowUserTask", _workflowUserTask == null ? null : _workflowUserTask.getMendixObject());
		params.put("ExpectedWorkflowTaskState", _expectedWorkflowTaskState == null ? null : _expectedWorkflowTaskState.name());
		params.put("MessagePrefix", _messagePrefix);
		return (java.lang.Boolean) Core.microflowCall("WorkflowCommonsUnitTests.WorkflowUserTask_HasExpectedState").withParams(params).execute(context);
	}
}