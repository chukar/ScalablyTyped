package typings.tslint

import typings.tslint.libLanguageFormatterAbstractFormatterMod.AbstractFormatter
import typings.tslint.libLanguageFormatterFormatterMod.IFormatterMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/formatters/stylishFormatter", JSImport.Namespace)
@js.native
object libFormattersStylishFormatterMod extends js.Object {
  @js.native
  class Formatter () extends AbstractFormatter {
    var getPositionMaxSize: js.Any = js.native
    var getRuleMaxSize: js.Any = js.native
    var mapToMessages: js.Any = js.native
    var pad: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Formatter extends js.Object {
    var metadata: IFormatterMetadata = js.native
  }
  
}

