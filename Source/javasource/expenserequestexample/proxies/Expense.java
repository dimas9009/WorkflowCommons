// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package expenserequestexample.proxies;

public class Expense implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject expenseMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ExpenseRequestExample.Expense";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Description("Description"),
		Amount("Amount"),
		Reimbursed("Reimbursed"),
		ExpenseRequest_Expense("ExpenseRequestExample.ExpenseRequest_Expense"),
		Expense_Account("ExpenseRequestExample.Expense_Account");

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

	public Expense(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Expense(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject expenseMendixObject)
	{
		if (expenseMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, expenseMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.expenseMendixObject = expenseMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static expenserequestexample.proxies.Expense initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new expenserequestexample.proxies.Expense(context, mendixObject);
	}

	public static expenserequestexample.proxies.Expense load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return expenserequestexample.proxies.Expense.initialize(context, mendixObject);
	}

	public static java.util.List<expenserequestexample.proxies.Expense> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> expenserequestexample.proxies.Expense.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
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
	 * @return value of Amount
	 */
	public final java.lang.Integer getAmount()
	{
		return getAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of Amount
	 */
	public final java.lang.Integer getAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Amount.toString());
	}

	/**
	 * Set value of Amount
	 * @param amount
	 */
	public final void setAmount(java.lang.Integer amount)
	{
		setAmount(getContext(), amount);
	}

	/**
	 * Set value of Amount
	 * @param context
	 * @param amount
	 */
	public final void setAmount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer amount)
	{
		getMendixObject().setValue(context, MemberNames.Amount.toString(), amount);
	}

	/**
	 * @return value of Reimbursed
	 */
	public final java.lang.Boolean getReimbursed()
	{
		return getReimbursed(getContext());
	}

	/**
	 * @param context
	 * @return value of Reimbursed
	 */
	public final java.lang.Boolean getReimbursed(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Reimbursed.toString());
	}

	/**
	 * Set value of Reimbursed
	 * @param reimbursed
	 */
	public final void setReimbursed(java.lang.Boolean reimbursed)
	{
		setReimbursed(getContext(), reimbursed);
	}

	/**
	 * Set value of Reimbursed
	 * @param context
	 * @param reimbursed
	 */
	public final void setReimbursed(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean reimbursed)
	{
		getMendixObject().setValue(context, MemberNames.Reimbursed.toString(), reimbursed);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of ExpenseRequest_Expense
	 */
	public final expenserequestexample.proxies.ExpenseRequest getExpenseRequest_Expense() throws com.mendix.core.CoreException
	{
		return getExpenseRequest_Expense(getContext());
	}

	/**
	 * @param context
	 * @return value of ExpenseRequest_Expense
	 * @throws com.mendix.core.CoreException
	 */
	public final expenserequestexample.proxies.ExpenseRequest getExpenseRequest_Expense(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		expenserequestexample.proxies.ExpenseRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ExpenseRequest_Expense.toString());
		if (identifier != null) {
			result = expenserequestexample.proxies.ExpenseRequest.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of ExpenseRequest_Expense
	 * @param expenserequest_expense
	 */
	public final void setExpenseRequest_Expense(expenserequestexample.proxies.ExpenseRequest expenserequest_expense)
	{
		setExpenseRequest_Expense(getContext(), expenserequest_expense);
	}

	/**
	 * Set value of ExpenseRequest_Expense
	 * @param context
	 * @param expenserequest_expense
	 */
	public final void setExpenseRequest_Expense(com.mendix.systemwideinterfaces.core.IContext context, expenserequestexample.proxies.ExpenseRequest expenserequest_expense)
	{
		if (expenserequest_expense == null) {
			getMendixObject().setValue(context, MemberNames.ExpenseRequest_Expense.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.ExpenseRequest_Expense.toString(), expenserequest_expense.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Expense_Account
	 */
	public final administration.proxies.Account getExpense_Account() throws com.mendix.core.CoreException
	{
		return getExpense_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of Expense_Account
	 * @throws com.mendix.core.CoreException
	 */
	public final administration.proxies.Account getExpense_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Expense_Account.toString());
		if (identifier != null) {
			result = administration.proxies.Account.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Expense_Account
	 * @param expense_account
	 */
	public final void setExpense_Account(administration.proxies.Account expense_account)
	{
		setExpense_Account(getContext(), expense_account);
	}

	/**
	 * Set value of Expense_Account
	 * @param context
	 * @param expense_account
	 */
	public final void setExpense_Account(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account expense_account)
	{
		if (expense_account == null) {
			getMendixObject().setValue(context, MemberNames.Expense_Account.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Expense_Account.toString(), expense_account.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return expenseMendixObject;
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
			final expenserequestexample.proxies.Expense that = (expenserequestexample.proxies.Expense) obj;
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
