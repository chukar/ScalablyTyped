package typings.adone.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BracesOptions extends js.Object {
  /**
    * Generate an "expanded" brace pattern (this option is unncessary with the `.expand` method, which does the same thing).
    *
    * @default undefined
    */
  var expand: js.UndefOr[Boolean] = js.undefined
  /**
    * Duplicates are removed by default. To keep duplicates, pass `{nodupes: false}` on the options
    *
    * @default true
    */
  var nodupes: js.UndefOr[Boolean] = js.undefined
  /**
    * Enabled by default.
    *
    * @default true
    */
  var optimize: js.UndefOr[Boolean] = js.undefined
  /**
    * In regular expressions, quanitifiers can be used to specify how many times a token can be repeated. For example, `a{1,3}` will match the letter `a` one to three times.
    *
    * Unfortunately, regex quantifiers happen to share the same syntax as [Bash lists](#lists)
    *
    * The `quantifiers` option tells braces to detect when [regex quantifiers](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp#quantifiers)
    * are defined in the given pattern, and not to try to expand them as lists.
    *
    * @default undefined
    */
  var quantifiers: js.UndefOr[Boolean] = js.undefined
  /**
    * When `braces.expand()` is used, or `options.expand` is true, brace patterns will automatically be [optimized](#optionsoptimize)
    * when the difference between the range minimum and range maximum exceeds the `rangeLimit`.
    * This is to prevent huge ranges from freezing your application.
    *
    * You can set this to any number, or change `options.rangeLimit` to `Inifinity` to disable this altogether.
    *
    * @default 250
    */
  var rangeLimit: js.UndefOr[Double] = js.undefined
  /**
    * Customize range expansion.
    *
    * @default undefined
    */
  var transform: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  /**
    * Strip backslashes that were used for escaping from the result.
    *
    * @default undefined
    */
  var unescape: js.UndefOr[Boolean] = js.undefined
}

object BracesOptions {
  @scala.inline
  def apply(
    expand: js.UndefOr[Boolean] = js.undefined,
    nodupes: js.UndefOr[Boolean] = js.undefined,
    optimize: js.UndefOr[Boolean] = js.undefined,
    quantifiers: js.UndefOr[Boolean] = js.undefined,
    rangeLimit: Int | Double = null,
    transform: /* str */ String => String = null,
    unescape: js.UndefOr[Boolean] = js.undefined
  ): BracesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expand)) __obj.updateDynamic("expand")(expand)
    if (!js.isUndefined(nodupes)) __obj.updateDynamic("nodupes")(nodupes)
    if (!js.isUndefined(optimize)) __obj.updateDynamic("optimize")(optimize)
    if (!js.isUndefined(quantifiers)) __obj.updateDynamic("quantifiers")(quantifiers)
    if (rangeLimit != null) __obj.updateDynamic("rangeLimit")(rangeLimit.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    if (!js.isUndefined(unescape)) __obj.updateDynamic("unescape")(unescape)
    __obj.asInstanceOf[BracesOptions]
  }
}

