package typings.reduxDashLocalstorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashLocalstorageMod {
  type AdapterCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], Unit]
  type StorageAdapterCreator[A] = js.Function1[/* storage */ A, StorageAdapter[A]]
}
