package typings.emberDashData

import typings.emberDashData.emberDashDataMod.DS.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data/transform", JSImport.Namespace)
@js.native
object transformMod extends js.Object {
  /**
    * The `DS.Transform` class is used to serialize and deserialize model
    * attributes when they are saved or loaded from an
    * adapter. Subclassing `DS.Transform` is useful for creating custom
    * attributes. All subclasses of `DS.Transform` must implement a
    * `serialize` and a `deserialize` method.
    */
  @js.native
  class default () extends Transform
  
}

