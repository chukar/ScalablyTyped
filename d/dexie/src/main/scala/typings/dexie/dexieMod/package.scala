package typings.dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dexieMod {
  import typings.std.ArrayBuffer
  import typings.std.ArrayBufferView
  import typings.std.DataView
  import typings.std.Date

  type Dexie = Dexie_
  type IndexableType = IndexableTypePart | IndexableTypeArrayReadonly
  type IndexableTypeArray = js.Array[IndexableTypePart]
  type IndexableTypeArrayReadonly = js.Array[IndexableTypePart]
  type IndexableTypePart = String | Double | Date | ArrayBuffer | ArrayBufferView | DataView | js.Array[js.Array[Unit]]
  type ThenShortcut[T, TResult] = js.Function1[/* value */ T, TResult | js.Thenable[TResult]]
  type default = default_
}
