package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutOrganizationConfigRuleRequest extends js.Object {
  /**
    * A comma-separated list of accounts that you want to exclude from an organization config rule.
    */
  var ExcludedAccounts: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ExcludedAccounts] = js.native
  /**
    * The name that you assign to an organization config rule.
    */
  var OrganizationConfigRuleName: typings.awsDashSdk.clientsConfigserviceMod.OrganizationConfigRuleName = js.native
  /**
    * An OrganizationCustomRuleMetadata object.
    */
  var OrganizationCustomRuleMetadata: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.OrganizationCustomRuleMetadata] = js.native
  /**
    * An OrganizationManagedRuleMetadata object. 
    */
  var OrganizationManagedRuleMetadata: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.OrganizationManagedRuleMetadata] = js.native
}

object PutOrganizationConfigRuleRequest {
  @scala.inline
  def apply(
    OrganizationConfigRuleName: OrganizationConfigRuleName,
    ExcludedAccounts: ExcludedAccounts = null,
    OrganizationCustomRuleMetadata: OrganizationCustomRuleMetadata = null,
    OrganizationManagedRuleMetadata: OrganizationManagedRuleMetadata = null
  ): PutOrganizationConfigRuleRequest = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any])
    if (ExcludedAccounts != null) __obj.updateDynamic("ExcludedAccounts")(ExcludedAccounts.asInstanceOf[js.Any])
    if (OrganizationCustomRuleMetadata != null) __obj.updateDynamic("OrganizationCustomRuleMetadata")(OrganizationCustomRuleMetadata.asInstanceOf[js.Any])
    if (OrganizationManagedRuleMetadata != null) __obj.updateDynamic("OrganizationManagedRuleMetadata")(OrganizationManagedRuleMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOrganizationConfigRuleRequest]
  }
}

