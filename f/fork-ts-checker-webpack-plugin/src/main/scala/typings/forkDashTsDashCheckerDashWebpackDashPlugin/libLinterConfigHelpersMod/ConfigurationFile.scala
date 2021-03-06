package typings.forkDashTsDashCheckerDashWebpackDashPlugin.libLinterConfigHelpersMod

import typings.forkDashTsDashCheckerDashWebpackDashPlugin.Anon_Exclude
import typings.std.Map
import typings.std.Partial
import typings.tslint.libConfigurationMod.IConfigurationFile
import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.libLanguageRuleRuleMod.RuleSeverity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationFile extends IConfigurationFile {
  @JSName("linterOptions")
  var linterOptions_ConfigurationFile: js.UndefOr[Anon_Exclude] = js.undefined
}

object ConfigurationFile {
  @scala.inline
  def apply(
    `extends`: js.Array[String],
    jsRules: Map[String, Partial[IOptions]],
    rules: Map[String, Partial[IOptions]],
    rulesDirectory: js.Array[String],
    defaultSeverity: RuleSeverity = null,
    linterOptions: Anon_Exclude = null
  ): ConfigurationFile = {
    val __obj = js.Dynamic.literal(jsRules = jsRules.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], rulesDirectory = rulesDirectory.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (defaultSeverity != null) __obj.updateDynamic("defaultSeverity")(defaultSeverity.asInstanceOf[js.Any])
    if (linterOptions != null) __obj.updateDynamic("linterOptions")(linterOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationFile]
  }
}

