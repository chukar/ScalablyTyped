package typings.semanticDashUiDashSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'overlay'
    */
  var bottom: String
  /**
    * @default 'uncover'
    */
  var left: String
  /**
    * @default 'uncover'
    */
  var right: String
  /**
    * @default 'overlay'
    */
  var top: String
}

object _Impl {
  @scala.inline
  def apply(bottom: String, left: String, right: String, top: String): _Impl = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

