package typings.eslint.eslintMod.Linter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintOptions extends js.Object {
  var allowInlineConfig: js.UndefOr[Boolean] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var postprocess: js.UndefOr[
    js.Function1[/* problemLists */ js.Array[js.Array[LintMessage]], js.Array[LintMessage]]
  ] = js.undefined
  var preprocess: js.UndefOr[js.Function1[/* code */ String, js.Array[String]]] = js.undefined
  var reportUnusedDisableDirectives: js.UndefOr[Boolean] = js.undefined
}

object LintOptions {
  @scala.inline
  def apply(
    allowInlineConfig: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    postprocess: /* problemLists */ js.Array[js.Array[LintMessage]] => js.Array[LintMessage] = null,
    preprocess: /* code */ String => js.Array[String] = null,
    reportUnusedDisableDirectives: js.UndefOr[Boolean] = js.undefined
  ): LintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInlineConfig)) __obj.updateDynamic("allowInlineConfig")(allowInlineConfig.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (postprocess != null) __obj.updateDynamic("postprocess")(js.Any.fromFunction1(postprocess))
    if (preprocess != null) __obj.updateDynamic("preprocess")(js.Any.fromFunction1(preprocess))
    if (!js.isUndefined(reportUnusedDisableDirectives)) __obj.updateDynamic("reportUnusedDisableDirectives")(reportUnusedDisableDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintOptions]
  }
}

