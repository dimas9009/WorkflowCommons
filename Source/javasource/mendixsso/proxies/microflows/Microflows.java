// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mendixsso.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MendixSSO module
	public static system.proxies.User authorizeRequestWithAccessTokenFromRequest(IContext context, system.proxies.HttpRequest _httpRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("HttpRequest", _httpRequest == null ? null : _httpRequest.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("MendixSSO.AuthorizeRequestWithAccessTokenFromRequest").withParams(params).execute(context);
		return result == null ? null : system.proxies.User.initialize(context, result);
	}
	public static boolean checkUserRolesRemoved(IContext context, system.proxies.User _user)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("User", _user == null ? null : _user.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("MendixSSO.CheckUserRolesRemoved").withParams(params).execute(context);
	}
	public static void cleanupAuthRequest(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MendixSSO.CleanupAuthRequest").withParams(params).execute(context);
	}
	public static java.util.List<system.proxies.HttpHeader> createAccessTokenAuthorizationHeaderList(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> objs = Core.microflowCall("MendixSSO.CreateAccessTokenAuthorizationHeaderList").withParams(params).execute(context);
		java.util.List<system.proxies.HttpHeader> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(system.proxies.HttpHeader.initialize(context, obj));
		}
		return result;
	}
	public static java.lang.String createAccessTokenAuthorizationHeaderValue(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.String) Core.microflowCall("MendixSSO.CreateAccessTokenAuthorizationHeaderValue").withParams(params).execute(context);
	}
	public static java.lang.String decrypt(IContext context, java.lang.String _encrypted)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Encrypted", _encrypted);
		return (java.lang.String) Core.microflowCall("MendixSSO.Decrypt").withParams(params).execute(context);
	}
	public static mendixsso.proxies.DecryptedToken dS_GetCurrentAccessToken(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MendixSSO.DS_GetCurrentAccessToken").withParams(params).execute(context);
		return result == null ? null : mendixsso.proxies.DecryptedToken.initialize(context, result);
	}
	public static administration.proxies.Account dS_GetCurrentAccount(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MendixSSO.DS_GetCurrentAccount").withParams(params).execute(context);
		return result == null ? null : administration.proxies.Account.initialize(context, result);
	}
	public static mendixsso.proxies.DecryptedToken dS_GetCurrentIdToken(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MendixSSO.DS_GetCurrentIdToken").withParams(params).execute(context);
		return result == null ? null : mendixsso.proxies.DecryptedToken.initialize(context, result);
	}
	public static mendixsso.proxies.DecryptedToken dS_GetCurrentRefreshToken(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MendixSSO.DS_GetCurrentRefreshToken").withParams(params).execute(context);
		return result == null ? null : mendixsso.proxies.DecryptedToken.initialize(context, result);
	}
	public static mendixsso.proxies.ForeignIdentity dS_GetForeignIdentity(IContext context, system.proxies.User _user)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("User", _user == null ? null : _user.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("MendixSSO.DS_GetForeignIdentity").withParams(params).execute(context);
		return result == null ? null : mendixsso.proxies.ForeignIdentity.initialize(context, result);
	}
	public static mendixsso.proxies.MendixSSOConfigurationView dS_GetMendixSSOConfiguration(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MendixSSO.DS_GetMendixSSOConfiguration").withParams(params).execute(context);
		return result == null ? null : mendixsso.proxies.MendixSSOConfigurationView.initialize(context, result);
	}
	public static java.lang.String encrypt(IContext context, java.lang.String _plain)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Plain", _plain);
		return (java.lang.String) Core.microflowCall("MendixSSO.Encrypt").withParams(params).execute(context);
	}
	public static java.lang.String getLegacyOpenIDForSSOUser(IContext context, system.proxies.User _user)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("User", _user == null ? null : _user.getMendixObject());
		return (java.lang.String) Core.microflowCall("MendixSSO.GetLegacyOpenIDForSSOUser").withParams(params).execute(context);
	}
	public static mendixsso.proxies.UserProfile getUserProfileFromUserInfoEndpoint(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MendixSSO.GetUserProfileFromUserInfoEndpoint").withParams(params).execute(context);
		return result == null ? null : mendixsso.proxies.UserProfile.initialize(context, result);
	}
	public static java.lang.String getUUIDForSSOUser(IContext context, system.proxies.User _user)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("User", _user == null ? null : _user.getMendixObject());
		return (java.lang.String) Core.microflowCall("MendixSSO.GetUUIDForSSOUser").withParams(params).execute(context);
	}
	public static void iVK_DecryptAndViewToken(IContext context, mendixsso.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("MendixSSO.IVK_DecryptAndViewToken").withParams(params).execute(context);
	}
	public static void iVK_DeleteAllTokens(IContext context, java.util.List<mendixsso.proxies.Token> _tokenList)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.ArrayList<IMendixObject> listparam_tokenList = null;
		if (_tokenList != null)
		{
			listparam_tokenList = new java.util.ArrayList<>();
			for (mendixsso.proxies.Token obj : _tokenList)
				listparam_tokenList.add(obj.getMendixObject());
		}
		params.put("TokenList", listparam_tokenList);

		Core.microflowCall("MendixSSO.IVK_DeleteAllTokens").withParams(params).execute(context);
	}
	public static void iVK_DeleteExpiredTokens(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MendixSSO.IVK_DeleteExpiredTokens").withParams(params).execute(context);
	}
	public static void iVK_DeleteMendixSSOUser(IContext context, java.util.List<administration.proxies.Account> _accountList)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.ArrayList<IMendixObject> listparam_accountList = null;
		if (_accountList != null)
		{
			listparam_accountList = new java.util.ArrayList<>();
			for (administration.proxies.Account obj : _accountList)
				listparam_accountList.add(obj.getMendixObject());
		}
		params.put("AccountList", listparam_accountList);

		Core.microflowCall("MendixSSO.IVK_DeleteMendixSSOUser").withParams(params).execute(context);
	}
	public static void iVK_DeleteToken(IContext context, mendixsso.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		Core.microflowCall("MendixSSO.IVK_DeleteToken").withParams(params).execute(context);
	}
	public static void iVK_NewLocalUser(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MendixSSO.IVK_NewLocalUser").withParams(params).execute(context);
	}
	public static void iVK_NewWebserviceUser(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MendixSSO.IVK_NewWebserviceUser").withParams(params).execute(context);
	}
	public static void iVK_RefreshTokens(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MendixSSO.IVK_RefreshTokens").withParams(params).execute(context);
	}
	public static void iVK_SaveChangedUser(IContext context, administration.proxies.Account _account)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Account", _account == null ? null : _account.getMendixObject());
		Core.microflowCall("MendixSSO.IVK_SaveChangedUser").withParams(params).execute(context);
	}
	public static boolean mendixSSO_AfterStartup(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MendixSSO.MendixSSO_AfterStartup").withParams(params).execute(context);
	}
	public static administration.proxies.Account mendixSSO_CreateUser(IContext context, mendixsso.proxies.UserProfile _userProfile, java.lang.String _uUID)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("UserProfile", _userProfile == null ? null : _userProfile.getMendixObject());
		params.put("UUID", _uUID);
		IMendixObject result = (IMendixObject)Core.microflowCall("MendixSSO.MendixSSO_CreateUser").withParams(params).execute(context);
		return result == null ? null : administration.proxies.Account.initialize(context, result);
	}
	public static administration.proxies.Account mendixSSO_UpdateUser(IContext context, administration.proxies.Account _user, mendixsso.proxies.UserProfile _userProfile, java.lang.String _uUID)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("User", _user == null ? null : _user.getMendixObject());
		params.put("UserProfile", _userProfile == null ? null : _userProfile.getMendixObject());
		params.put("UUID", _uUID);
		IMendixObject result = (IMendixObject)Core.microflowCall("MendixSSO.MendixSSO_UpdateUser").withParams(params).execute(context);
		return result == null ? null : administration.proxies.Account.initialize(context, result);
	}
	public static void migrateMendixSSOUsersToAdministrationAccounts(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MendixSSO.MigrateMendixSSOUsersToAdministrationAccounts").withParams(params).execute(context);
	}
	public static mendixsso.proxies.Response refreshTokens(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MendixSSO.RefreshTokens").withParams(params).execute(context);
		return result == null ? null : mendixsso.proxies.Response.initialize(context, result);
	}
	public static void refreshUserRoles(IContext context, system.proxies.User _user, java.lang.String _uUID)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("User", _user == null ? null : _user.getMendixObject());
		params.put("UUID", _uUID);
		Core.microflowCall("MendixSSO.RefreshUserRoles").withParams(params).execute(context);
	}
	public static boolean retrieveUserRoles(IContext context, system.proxies.User _user, java.lang.String _uUID)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("User", _user == null ? null : _user.getMendixObject());
		params.put("UUID", _uUID);
		return (java.lang.Boolean) Core.microflowCall("MendixSSO.RetrieveUserRoles").withParams(params).execute(context);
	}
	public static void rS_NotifyUserRolesChanged(IContext context, java.lang.String _uUID)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("UUID", _uUID);
		Core.microflowCall("MendixSSO.RS_NotifyUserRolesChanged").withParams(params).execute(context);
	}
	public static void sE_DeleteExpiredTokens(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MendixSSO.SE_DeleteExpiredTokens").withParams(params).execute(context);
	}
	public static system.proxies.User sUB_AuthorizeRequestWithAccessTokenFromHeader(IContext context, java.lang.String _authorizationHeader)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("AuthorizationHeader", _authorizationHeader);
		IMendixObject result = (IMendixObject)Core.microflowCall("MendixSSO.SUB_AuthorizeRequestWithAccessTokenFromHeader").withParams(params).execute(context);
		return result == null ? null : system.proxies.User.initialize(context, result);
	}
	public static mendixsso.proxies.DecryptedToken sUB_DecryptToken(IContext context, mendixsso.proxies.Token _token)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Token", _token == null ? null : _token.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("MendixSSO.SUB_DecryptToken").withParams(params).execute(context);
		return result == null ? null : mendixsso.proxies.DecryptedToken.initialize(context, result);
	}
	public static mendixsso.proxies.DecryptedToken sUB_GetAccessTokenAndEnsureNotExpiresSoon(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MendixSSO.SUB_GetAccessTokenAndEnsureNotExpiresSoon").withParams(params).execute(context);
		return result == null ? null : mendixsso.proxies.DecryptedToken.initialize(context, result);
	}
	public static mendixsso.proxies.DecryptedToken sUB_GetDecryptedTokenByTypeForCurrentSession(IContext context, mendixsso.proxies.TokenType _tokenType)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenType", _tokenType == null ? null : _tokenType.name());
		IMendixObject result = (IMendixObject)Core.microflowCall("MendixSSO.SUB_GetDecryptedTokenByTypeForCurrentSession").withParams(params).execute(context);
		return result == null ? null : mendixsso.proxies.DecryptedToken.initialize(context, result);
	}
	public static java.lang.String sUB_GetHttpHeaderValue(IContext context, java.lang.String _headerName, system.proxies.HttpMessage _httpMessage)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("HeaderName", _headerName);
		params.put("HttpMessage", _httpMessage == null ? null : _httpMessage.getMendixObject());
		return (java.lang.String) Core.microflowCall("MendixSSO.SUB_GetHttpHeaderValue").withParams(params).execute(context);
	}
	public static mendixsso.proxies.Token sUB_GetTokenByTypeForCurrentSession(IContext context, mendixsso.proxies.TokenType _tokenType)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenType", _tokenType == null ? null : _tokenType.name());
		IMendixObject result = (IMendixObject)Core.microflowCall("MendixSSO.SUB_GetTokenByTypeForCurrentSession").withParams(params).execute(context);
		return result == null ? null : mendixsso.proxies.Token.initialize(context, result);
	}
	public static java.lang.String sUB_GetUserInfoFromIdentityProvider(IContext context, java.lang.String _accessToken)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("AccessToken", _accessToken);
		return (java.lang.String) Core.microflowCall("MendixSSO.SUB_GetUserInfoFromIdentityProvider").withParams(params).execute(context);
	}
	public static mendixsso.proxies.Response sUB_RefreshTokens(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MendixSSO.SUB_RefreshTokens").withParams(params).execute(context);
		return result == null ? null : mendixsso.proxies.Response.initialize(context, result);
	}
	public static void sUB_ReplaceRenewedToken(IContext context, java.lang.String _tokenValue, mendixsso.proxies.TokenType _tokenType, java.lang.Long _expiresIn)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TokenValue", _tokenValue);
		params.put("TokenType", _tokenType == null ? null : _tokenType.name());
		params.put("ExpiresIn", _expiresIn);
		Core.microflowCall("MendixSSO.SUB_ReplaceRenewedToken").withParams(params).execute(context);
	}
	public static java.lang.String sUB_ValidateHeaderAndReturnAccessToken(IContext context, java.lang.String _authorizationHeader)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("AuthorizationHeader", _authorizationHeader);
		return (java.lang.String) Core.microflowCall("MendixSSO.SUB_ValidateHeaderAndReturnAccessToken").withParams(params).execute(context);
	}
}