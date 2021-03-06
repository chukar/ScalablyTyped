package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListExcel extends js.Object {
  var fileName: js.UndefOr[String] = js.undefined
  var filterable: js.UndefOr[Boolean] = js.undefined
  var forceProxy: js.UndefOr[Boolean] = js.undefined
  var proxyURL: js.UndefOr[String] = js.undefined
}

object TreeListExcel {
  @scala.inline
  def apply(
    fileName: String = null,
    filterable: js.UndefOr[Boolean] = js.undefined,
    forceProxy: js.UndefOr[Boolean] = js.undefined,
    proxyURL: String = null
  ): TreeListExcel = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (!js.isUndefined(forceProxy)) __obj.updateDynamic("forceProxy")(forceProxy.asInstanceOf[js.Any])
    if (proxyURL != null) __obj.updateDynamic("proxyURL")(proxyURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListExcel]
  }
}

