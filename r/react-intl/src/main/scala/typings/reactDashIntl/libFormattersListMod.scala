package typings.reactDashIntl

import typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatMod.default
import typings.reactDashIntl.libTypesMod.IntlConfig
import typings.reactDashIntl.reactDashIntlStrings.locale
import typings.reactDashIntl.reactDashIntlStrings.onError
import typings.std.ConstructorParameters
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/formatters/list", JSImport.Namespace)
@js.native
object libFormattersListMod extends js.Object {
  def formatList(
    hasLocaleOnError: Pick[IntlConfig, locale | onError],
    getListFormat: js.Function1[/* args */ ConstructorParameters[TypeofClassIntlListFormat], default],
    values: js.Array[String],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.Fn_Opts>[1] */ js.Any
  ): String = js.native
}

