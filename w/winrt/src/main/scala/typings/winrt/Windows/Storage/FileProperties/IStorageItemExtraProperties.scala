package typings.winrt.Windows.Storage.FileProperties

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMap
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageItemExtraProperties extends js.Object {
  def retrievePropertiesAsync(propertiesToRetrieve: IIterable[String]): IAsyncOperation[IMap[String, _]] = js.native
  def savePropertiesAsync(): IAsyncAction = js.native
  def savePropertiesAsync(propertiesToSave: IIterable[IKeyValuePair[String, _]]): IAsyncAction = js.native
}

