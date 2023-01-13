// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package objecthandling.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

public class setMemberValueByMemberName extends CustomJavaAction<java.lang.Void>
{
	private IMendixObject MxObject;
	private java.lang.String AttributeName;
	private java.lang.String AttributeValue;

	public setMemberValueByMemberName(IContext context, IMendixObject MxObject, java.lang.String AttributeName, java.lang.String AttributeValue)
	{
		super(context);
		this.MxObject = MxObject;
		this.AttributeName = AttributeName;
		this.AttributeValue = AttributeValue;
	}

	@java.lang.Override
	public java.lang.Void executeAction() throws Exception
	{
		// BEGIN USER CODE
		MxObject.setValue(getContext(), AttributeName,AttributeValue);
		return null;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "setMemberValueByMemberName";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}