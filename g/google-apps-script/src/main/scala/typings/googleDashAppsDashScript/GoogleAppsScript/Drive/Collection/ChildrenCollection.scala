package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.ChildList
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.ChildReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildrenCollection extends js.Object {
  // Gets a specific child reference.
  def get(folderId: String, childId: String): ChildReference = js.native
  // Inserts a file into a folder.
  def insert(resource: ChildReference, folderId: String): ChildReference = js.native
  // Inserts a file into a folder.
  def insert(resource: ChildReference, folderId: String, optionalArgs: js.Object): ChildReference = js.native
  // Lists a folder's children.
  def list(folderId: String): ChildList = js.native
  // Lists a folder's children.
  def list(folderId: String, optionalArgs: js.Object): ChildList = js.native
  // Removes a child from a folder.
  def remove(folderId: String, childId: String): Unit = js.native
}

