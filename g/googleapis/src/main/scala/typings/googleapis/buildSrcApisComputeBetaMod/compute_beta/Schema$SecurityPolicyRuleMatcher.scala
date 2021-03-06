package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a match condition that incoming traffic is evaluated against.
  * Exactly one field must be specified.
  */
@js.native
trait Schema$SecurityPolicyRuleMatcher extends js.Object {
  /**
    * The configuration options available when specifying versioned_expr. This
    * field must be specified if versioned_expr is specified and cannot be
    * specified if versioned_expr is not specified.
    */
  var config: js.UndefOr[Schema$SecurityPolicyRuleMatcherConfig] = js.native
  /**
    * User defined CEVAL expression. A CEVAL expression is used to specify
    * match criteria such as origin.ip, source.region_code and contents in the
    * request header.
    */
  var expr: js.UndefOr[Schema$Expr] = js.native
  /**
    * Preconfigured versioned expression. If this field is specified, config
    * must also be specified. Available preconfigured expressions along with
    * their requirements are: SRC_IPS_V1 - must specify the corresponding
    * src_ip_range field in config.
    */
  var versionedExpr: js.UndefOr[String] = js.native
}

object Schema$SecurityPolicyRuleMatcher {
  @scala.inline
  def apply(
    config: Schema$SecurityPolicyRuleMatcherConfig = null,
    expr: Schema$Expr = null,
    versionedExpr: String = null
  ): Schema$SecurityPolicyRuleMatcher = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (expr != null) __obj.updateDynamic("expr")(expr.asInstanceOf[js.Any])
    if (versionedExpr != null) __obj.updateDynamic("versionedExpr")(versionedExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SecurityPolicyRuleMatcher]
  }
}

