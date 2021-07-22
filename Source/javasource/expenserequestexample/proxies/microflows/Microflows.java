// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package expenserequestexample.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the ExpenseRequestExample module
	public static void aCT_ApproveExpenseRequest(IContext context, expenserequestexample.proxies.ExpenseRequest _expenseRequest, system.proxies.WorkflowUserTask _userTask)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ExpenseRequest", _expenseRequest == null ? null : _expenseRequest.getMendixObject());
		params.put("UserTask", _userTask == null ? null : _userTask.getMendixObject());
		Core.microflowCall("ExpenseRequestExample.ACT_ApproveExpenseRequest").withParams(params).execute(context);
	}
	public static void aCT_ApproveExpenseRequest_Secondary(IContext context, expenserequestexample.proxies.ExpenseRequest _expenseRequest, system.proxies.WorkflowUserTask _userTask)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ExpenseRequest", _expenseRequest == null ? null : _expenseRequest.getMendixObject());
		params.put("UserTask", _userTask == null ? null : _userTask.getMendixObject());
		Core.microflowCall("ExpenseRequestExample.ACT_ApproveExpenseRequest_Secondary").withParams(params).execute(context);
	}
	public static void aCT_Expense_New(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("ExpenseRequestExample.ACT_Expense_New").withParams(params).execute(context);
	}
	public static void aCT_Expense_Save(IContext context, expenserequestexample.proxies.Expense _expense)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Expense", _expense == null ? null : _expense.getMendixObject());
		Core.microflowCall("ExpenseRequestExample.ACT_Expense_Save").withParams(params).execute(context);
	}
	public static void aCT_RejectExpenseRequest(IContext context, system.proxies.WorkflowUserTask _userTask, expenserequestexample.proxies.ExpenseRequest _expenseRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("UserTask", _userTask == null ? null : _userTask.getMendixObject());
		params.put("ExpenseRequest", _expenseRequest == null ? null : _expenseRequest.getMendixObject());
		Core.microflowCall("ExpenseRequestExample.ACT_RejectExpenseRequest").withParams(params).execute(context);
	}
	public static void aCT_RejectExpenseRequest_Secondary(IContext context, system.proxies.WorkflowUserTask _userTask, expenserequestexample.proxies.ExpenseRequest _expenseRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("UserTask", _userTask == null ? null : _userTask.getMendixObject());
		params.put("ExpenseRequest", _expenseRequest == null ? null : _expenseRequest.getMendixObject());
		Core.microflowCall("ExpenseRequestExample.ACT_RejectExpenseRequest_Secondary").withParams(params).execute(context);
	}
	public static void aCT_SetMarkAllWorkflowsOverdue(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("ExpenseRequestExample.ACT_SetMarkAllWorkflowsOverdue").withParams(params).execute(context);
	}
	public static void aCT_Workflow_Pause(IContext context, system.proxies.WorkflowInstance _workflow)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Workflow", _workflow == null ? null : _workflow.getMendixObject());
		Core.microflowCall("ExpenseRequestExample.ACT_Workflow_Pause").withParams(params).execute(context);
	}
	public static void aCT_Workflow_Resume(IContext context, system.proxies.WorkflowInstance _workflow)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Workflow", _workflow == null ? null : _workflow.getMendixObject());
		Core.microflowCall("ExpenseRequestExample.ACT_Workflow_Resume").withParams(params).execute(context);
	}
	public static void sUB_StartExpenseRequest(IContext context, expenserequestexample.proxies.Expense _expense)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Expense", _expense == null ? null : _expense.getMendixObject());
		Core.microflowCall("ExpenseRequestExample.SUB_StartExpenseRequest").withParams(params).execute(context);
	}
	public static boolean vAL_Expense(IContext context, expenserequestexample.proxies.Expense _expense)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Expense", _expense == null ? null : _expense.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("ExpenseRequestExample.VAL_Expense").withParams(params).execute(context);
	}
	public static boolean vAL_ExpenseRequest(IContext context, expenserequestexample.proxies.ExpenseRequest _expenseRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ExpenseRequest", _expenseRequest == null ? null : _expenseRequest.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("ExpenseRequestExample.VAL_ExpenseRequest").withParams(params).execute(context);
	}
	public static void wF_ReimburseExpenseRequest(IContext context, expenserequestexample.proxies.ExpenseRequest _expenseRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ExpenseRequest", _expenseRequest == null ? null : _expenseRequest.getMendixObject());
		Core.microflowCall("ExpenseRequestExample.WF_ReimburseExpenseRequest").withParams(params).execute(context);
	}
	public static void wOC_ExecuteFollowupActions(IContext context, system.proxies.WorkflowUserTask _userTask, expenserequestexample.proxies.ExpenseRequest _expenseRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("UserTask", _userTask == null ? null : _userTask.getMendixObject());
		params.put("ExpenseRequest", _expenseRequest == null ? null : _expenseRequest.getMendixObject());
		Core.microflowCall("ExpenseRequestExample.WOC_ExecuteFollowupActions").withParams(params).execute(context);
	}
}