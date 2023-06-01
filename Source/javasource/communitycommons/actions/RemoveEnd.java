// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import communitycommons.StringUtils;

/**
 * Removes a string (if present) from the end of an input string,
 */
public class RemoveEnd extends CustomJavaAction<java.lang.String>
{
	private final java.lang.String input;
	private final java.lang.String toRemove;

	public RemoveEnd(
		IContext context,
		java.lang.String _input,
		java.lang.String _toRemove
	)
	{
		super(context);
		this.input = _input;
		this.toRemove = _toRemove;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return StringUtils.removeEnd(input, toRemove);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "RemoveEnd";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
