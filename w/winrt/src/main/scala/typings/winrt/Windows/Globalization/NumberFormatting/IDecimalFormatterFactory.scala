package typings.winrt.Windows.Globalization.NumberFormatting

import typings.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDecimalFormatterFactory extends js.Object {
  def createDecimalFormatter(languages: IIterable[String], geographicRegion: String): DecimalFormatter
}

object IDecimalFormatterFactory {
  @scala.inline
  def apply(createDecimalFormatter: (IIterable[String], String) => DecimalFormatter): IDecimalFormatterFactory = {
    val __obj = js.Dynamic.literal(createDecimalFormatter = js.Any.fromFunction2(createDecimalFormatter))
  
    __obj.asInstanceOf[IDecimalFormatterFactory]
  }
}

