package typings.activexDashAccess.Access

import typings.activexDashOffice.Office.MsoEncoding
import typings.activexDashOffice.Office.MsoTargetBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.WebOptions")
@js.native
class WebOptions protected () extends js.Object {
  @JSName("Access.WebOptions_typekey")
  var AccessDotWebOptions_typekey: WebOptions = js.native
  val Application: typings.activexDashAccess.Access.Application = js.native
  var DownloadComponents: Boolean = js.native
  var Encoding: MsoEncoding = js.native
  val FolderSuffix: String = js.native
  var LocationOfComponents: String = js.native
  var OrganizeInFolder: Boolean = js.native
  val Parent: js.Any = js.native
  var TargetBrowser: MsoTargetBrowser = js.native
  var UseLongFileNames: Boolean = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def UseDefaultFolderSuffix(): Unit = js.native
}

