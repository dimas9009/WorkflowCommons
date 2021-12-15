// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package unittesting.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the UnitTesting module
	public static void assertTrue1(IContext context, boolean _valueToAssert)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ValueToAssert", _valueToAssert);
		Core.microflowCall("UnitTesting.AssertTrue1").withParams(params).execute(context);
	}
	public static void assertTrue2(IContext context, boolean _valueToAssert, java.lang.String _message)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ValueToAssert", _valueToAssert);
		params.put("Message", _message);
		Core.microflowCall("UnitTesting.AssertTrue2").withParams(params).execute(context);
	}
	public static void iVK_FindAllTests(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("UnitTesting.IVK_FindAllTests").withParams(params).execute(context);
	}
	public static void iVK_RefreshUnitTestOverview(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("UnitTesting.IVK_RefreshUnitTestOverview").withParams(params).execute(context);
	}
	public static void iVK_RemoveAllAndFindAllTests(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("UnitTesting.IVK_RemoveAllAndFindAllTests").withParams(params).execute(context);
	}
	public static void iVK_RemoveTestSuiteAndFindAllTests(IContext context, unittesting.proxies.TestSuite _testSuite)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestSuite", _testSuite == null ? null : _testSuite.getMendixObject());
		Core.microflowCall("UnitTesting.IVK_RemoveTestSuiteAndFindAllTests").withParams(params).execute(context);
	}
	public static void iVK_ResetUnitTests(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("UnitTesting.IVK_ResetUnitTests").withParams(params).execute(context);
	}
	public static void iVK_RunAllTests(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("UnitTesting.IVK_RunAllTests").withParams(params).execute(context);
	}
	public static void iVK_ToggleAutoRollback(IContext context, unittesting.proxies.TestSuite _testSuite)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestSuite", _testSuite == null ? null : _testSuite.getMendixObject());
		Core.microflowCall("UnitTesting.IVK_ToggleAutoRollback").withParams(params).execute(context);
	}
	public static void iVK_UnitTestDetails(IContext context, unittesting.proxies.UnitTest _unitTest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("UnitTest", _unitTest == null ? null : _unitTest.getMendixObject());
		Core.microflowCall("UnitTesting.IVK_UnitTestDetails").withParams(params).execute(context);
	}
	public static void oCh_TestSuiteRollback(IContext context, unittesting.proxies.TestSuite _testSuite)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestSuite", _testSuite == null ? null : _testSuite.getMendixObject());
		Core.microflowCall("UnitTesting.OCh_TestSuiteRollback").withParams(params).execute(context);
	}
	public static void reportStep(IContext context, java.lang.String _message)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Message", _message);
		Core.microflowCall("UnitTesting.ReportStep").withParams(params).execute(context);
	}
	public static void rerunUnittest(IContext context, unittesting.proxies.UnitTest _unitTestRun)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("UnitTestRun", _unitTestRun == null ? null : _unitTestRun.getMendixObject());
		Core.microflowCall("UnitTesting.RerunUnittest").withParams(params).execute(context);
	}
	public static void setup(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("UnitTesting.Setup").withParams(params).execute(context);
	}
	public static void startUnittestRun(IContext context, unittesting.proxies.TestSuite _testSuite)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestSuite", _testSuite == null ? null : _testSuite.getMendixObject());
		Core.microflowCall("UnitTesting.StartUnittestRun").withParams(params).execute(context);
	}
	public static boolean startup(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("UnitTesting.Startup").withParams(params).execute(context);
	}
	public static void tearDown(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("UnitTesting.TearDown").withParams(params).execute(context);
	}
	public static boolean test_FailingUnitTest(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("UnitTesting.Test_FailingUnitTest").withParams(params).execute(context);
	}
	public static boolean test_IsAssertionErrorCheck(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("UnitTesting.Test_IsAssertionErrorCheck").withParams(params).execute(context);
	}
	public static boolean test_ValidUnitTest(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("UnitTesting.Test_ValidUnitTest").withParams(params).execute(context);
	}
	public static void test_WithoutReturn(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("UnitTesting.Test_WithoutReturn").withParams(params).execute(context);
	}
	public static void unitTestOverview(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("UnitTesting.UnitTestOverview").withParams(params).execute(context);
	}
	public static boolean uT_ValidUnitTest(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("UnitTesting.UT_ValidUnitTest").withParams(params).execute(context);
	}
}