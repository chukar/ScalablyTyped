package typings.adalDashAngular.adalDashAngularMod

import typings.adalDashAngular.Anon_0
import typings.adalDashAngular.Anon_01
import typings.adalDashAngular.Anon_ACCESSTOKENKEY
import typings.adalDashAngular.adalDashAngularNumbers.`483`
import typings.adalDashAngular.adalDashAngularNumbers.`600`
import typings.adalDashAngular.adalDashAngularStrings.Canceled
import typings.adalDashAngular.adalDashAngularStrings.Completed
import typings.adalDashAngular.adalDashAngularStrings.Verticalline
import typings.adalDashAngular.adalDashAngularStrings.`6000`
import typings.adalDashAngular.adalDashAngularStrings.`In Progress`
import typings.adalDashAngular.adalDashAngularStrings.access_token
import typings.adalDashAngular.adalDashAngularStrings.error_description
import typings.adalDashAngular.adalDashAngularStrings.expires_in
import typings.adalDashAngular.adalDashAngularStrings.id_token
import typings.adalDashAngular.adalDashAngularStrings.session_state
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enum for storage constants
  */
trait Constants extends js.Object {
  var ACCESS_TOKEN: access_token
  var ERROR_DESCRIPTION: error_description
  var EXPIRES_IN: expires_in
  var ID_TOKEN: id_token
  var LEVEL_STRING_MAP: Anon_01
  var LOADFRAME_TIMEOUT: `6000`
  var LOGGING_LEVEL: Anon_0
  var POPUP_HEIGHT: `600`
  var POPUP_WIDTH: `483`
  var RESOURCE_DELIMETER: Verticalline
  var SESSION_STATE: session_state
  var STORAGE: Anon_ACCESSTOKENKEY
  var TOKEN_RENEW_STATUS_CANCELED: Canceled
  var TOKEN_RENEW_STATUS_COMPLETED: Completed
  var TOKEN_RENEW_STATUS_IN_PROGRESS: `In Progress`
}

object Constants {
  @scala.inline
  def apply(
    ACCESS_TOKEN: access_token,
    ERROR_DESCRIPTION: error_description,
    EXPIRES_IN: expires_in,
    ID_TOKEN: id_token,
    LEVEL_STRING_MAP: Anon_01,
    LOADFRAME_TIMEOUT: `6000`,
    LOGGING_LEVEL: Anon_0,
    POPUP_HEIGHT: `600`,
    POPUP_WIDTH: `483`,
    RESOURCE_DELIMETER: Verticalline,
    SESSION_STATE: session_state,
    STORAGE: Anon_ACCESSTOKENKEY,
    TOKEN_RENEW_STATUS_CANCELED: Canceled,
    TOKEN_RENEW_STATUS_COMPLETED: Completed,
    TOKEN_RENEW_STATUS_IN_PROGRESS: `In Progress`
  ): Constants = {
    val __obj = js.Dynamic.literal(ACCESS_TOKEN = ACCESS_TOKEN.asInstanceOf[js.Any], ERROR_DESCRIPTION = ERROR_DESCRIPTION.asInstanceOf[js.Any], EXPIRES_IN = EXPIRES_IN.asInstanceOf[js.Any], ID_TOKEN = ID_TOKEN.asInstanceOf[js.Any], LEVEL_STRING_MAP = LEVEL_STRING_MAP.asInstanceOf[js.Any], LOADFRAME_TIMEOUT = LOADFRAME_TIMEOUT.asInstanceOf[js.Any], LOGGING_LEVEL = LOGGING_LEVEL.asInstanceOf[js.Any], POPUP_HEIGHT = POPUP_HEIGHT.asInstanceOf[js.Any], POPUP_WIDTH = POPUP_WIDTH.asInstanceOf[js.Any], RESOURCE_DELIMETER = RESOURCE_DELIMETER.asInstanceOf[js.Any], SESSION_STATE = SESSION_STATE.asInstanceOf[js.Any], STORAGE = STORAGE.asInstanceOf[js.Any], TOKEN_RENEW_STATUS_CANCELED = TOKEN_RENEW_STATUS_CANCELED.asInstanceOf[js.Any], TOKEN_RENEW_STATUS_COMPLETED = TOKEN_RENEW_STATUS_COMPLETED.asInstanceOf[js.Any], TOKEN_RENEW_STATUS_IN_PROGRESS = TOKEN_RENEW_STATUS_IN_PROGRESS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Constants]
  }
}

