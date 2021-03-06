package typings.reactDashToastify.reactDashToastifyMod

import typings.reactDashToastify.reactDashToastifyStrings.default
import typings.reactDashToastify.reactDashToastifyStrings.error
import typings.reactDashToastify.reactDashToastifyStrings.info
import typings.reactDashToastify.reactDashToastifyStrings.success
import typings.reactDashToastify.reactDashToastifyStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  /**
    * Set notification type to `'default'`
    */
  var DEFAULT: default
  /**
    * Set notification type to `'error'`
    */
  var ERROR: error
  /**
    * Set notification type to `'info'`
    */
  var INFO: info
  /**
    * Set notification type to `'success'`
    */
  var SUCCESS: success
  /**
    * Set notification type to `'warning'`
    */
  var WARNING: warning
}

object Type {
  @scala.inline
  def apply(DEFAULT: default, ERROR: error, INFO: info, SUCCESS: success, WARNING: warning): Type = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any], WARNING = WARNING.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Type]
  }
}

