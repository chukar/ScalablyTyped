package typings.activexDashAccess.Access

import typings.activexDashOffice.Office.MsoEncoding
import typings.activexDashOffice.Office.MsoTargetBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Access.DefaultWebOptions")
@js.native
class DefaultWebOptions protected () extends js.Object {
  @JSName("Access.DefaultWebOptions_typekey")
  var AccessDotDefaultWebOptions_typekey: DefaultWebOptions = js.native
  var AlwaysSaveInDefaultEncoding: Boolean = js.native
  val Application: typings.activexDashAccess.Access.Application = js.native
  var CheckIfOfficeIsHTMLEditor: Boolean = js.native
  var DownloadComponents: Boolean = js.native
  var Encoding: MsoEncoding = js.native
  val FolderSuffix: String = js.native
  var FollowedHyperlinkColor: AcColorIndex = js.native
  var HyperlinkColor: AcColorIndex = js.native
  var LocationOfComponents: String = js.native
  var OrganizeInFolder: Boolean = js.native
  val Parent: js.Any = js.native
  var TargetBrowser: MsoTargetBrowser = js.native
  var UnderlineHyperlinks: Boolean = js.native
  var UseLongFileNames: Boolean = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

