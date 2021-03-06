package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.File
import typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema.FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesCollection extends js.Object {
  // Retrieves a report file by its report ID and file ID. This method supports media download.
  def get(reportId: String, fileId: String): File = js.native
  // Lists files for a user profile.
  def list(profileId: String): FileList = js.native
  // Lists files for a user profile.
  def list(profileId: String, optionalArgs: js.Object): FileList = js.native
}

