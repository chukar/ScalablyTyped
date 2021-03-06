package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueNumberStorageFile extends js.Object {
  /** The items in the collection that start at startIndex. */ var items: StorageFile
  /** The number of items returned. */ var returnValue: Double
}

object Anon_ItemsReturnValueNumberStorageFile {
  @scala.inline
  def apply(items: StorageFile, returnValue: Double): Anon_ItemsReturnValueNumberStorageFile = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemsReturnValueNumberStorageFile]
  }
}

