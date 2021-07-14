// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package filehandling.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import filehandling.FileHandling;

/**
 * Returns the filesize of a file document in bytes.
 */
public class getFileSize extends CustomJavaAction<java.lang.Long>
{
	private IMendixObject __document;
	private system.proxies.FileDocument document;

	public getFileSize(IContext context, IMendixObject document)
	{
		super(context);
		this.__document = document;
	}

	@java.lang.Override
	public java.lang.Long executeAction() throws Exception
	{
		this.document = __document == null ? null : system.proxies.FileDocument.initialize(getContext(), __document);

		// BEGIN USER CODE
		return FileHandling.getFileSize(this.getContext(), document.getMendixObject());
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "getFileSize";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
