package typings.intlDashMessageformat.libCoreMod

import typings.intlDashMessageformat.Anon_Date
import typings.intlDashMessageformat.Fn_Input
import typings.intlDashMessageformat.libFormattersMod.Formats
import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.MessageFormatElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat/lib/core", JSImport.Default)
@js.native
class default protected () extends IntlMessageFormat {
  def this(message: String) = this()
  def this(message: js.Array[MessageFormatElement]) = this()
  def this(message: String, locales: String) = this()
  def this(message: String, locales: js.Array[String]) = this()
  def this(message: js.Array[MessageFormatElement], locales: String) = this()
  def this(message: js.Array[MessageFormatElement], locales: js.Array[String]) = this()
  def this(message: String, locales: String, overrideFormats: Partial[Formats]) = this()
  def this(message: String, locales: js.Array[String], overrideFormats: Partial[Formats]) = this()
  def this(message: js.Array[MessageFormatElement], locales: String, overrideFormats: Partial[Formats]) = this()
  def this(
    message: js.Array[MessageFormatElement],
    locales: js.Array[String],
    overrideFormats: Partial[Formats]
  ) = this()
  def this(message: String, locales: String, overrideFormats: Partial[Formats], opts: Options) = this()
  def this(message: String, locales: js.Array[String], overrideFormats: Partial[Formats], opts: Options) = this()
  def this(
    message: js.Array[MessageFormatElement],
    locales: String,
    overrideFormats: Partial[Formats],
    opts: Options
  ) = this()
  def this(
    message: js.Array[MessageFormatElement],
    locales: js.Array[String],
    overrideFormats: Partial[Formats],
    opts: Options
  ) = this()
}

/* static members */
@JSImport("intl-messageformat/lib/core", JSImport.Default)
@js.native
object default extends js.Object {
  var __parse: js.UndefOr[Fn_Input] = js.native
  var defaultLocale: String = js.native
  var formats: Anon_Date = js.native
}

