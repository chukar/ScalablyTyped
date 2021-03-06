package typings.awsDashSdk.clientsMarketplacecommerceanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateDataSetRequest extends js.Object {
  /**
    * (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and the data set metadata file. These key-value pairs can be used to correlated responses with tracking information from other systems.
    */
  var customerDefinedValues: js.UndefOr[CustomerDefinedValues] = js.native
  /**
    * The date a data set was published. For daily data sets, provide a date with day-level granularity for the desired day. For weekly data sets, provide a date with day-level granularity within the desired week (the day value will be ignored). For monthly data sets, provide a date with month-level granularity for the desired month (the day value will be ignored).
    */
  var dataSetPublicationDate: DataSetPublicationDate = js.native
  /**
    * The desired data set type.    customer_subscriber_hourly_monthly_subscriptions From 2014-07-21 to present: Available daily by 24:00 UTC.   customer_subscriber_annual_subscriptions From 2014-07-21 to present: Available daily by 24:00 UTC.   daily_business_usage_by_instance_type From 2015-01-26 to present: Available daily by 24:00 UTC.   daily_business_fees From 2015-01-26 to present: Available daily by 24:00 UTC.   daily_business_free_trial_conversions From 2015-01-26 to present: Available daily by 24:00 UTC.   daily_business_new_instances From 2015-01-26 to present: Available daily by 24:00 UTC.   daily_business_new_product_subscribers From 2015-01-26 to present: Available daily by 24:00 UTC.   daily_business_canceled_product_subscribers From 2015-01-26 to present: Available daily by 24:00 UTC.   monthly_revenue_billing_and_revenue_data From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 24:00 UTC. Data includes metered transactions (e.g. hourly) from two months prior. From 2017-07 to present: Available monthly on the 15th day of the month by 24:00 UTC. Data includes metered transactions (e.g. hourly) from one month prior.   monthly_revenue_annual_subscriptions From 2015-02 to 2017-06: Available monthly on the 4th day of the month by 24:00 UTC. Data includes up-front software charges (e.g. annual) from one month prior. From 2017-07 to present: Available monthly on the 15th day of the month by 24:00 UTC. Data includes up-front software charges (e.g. annual) from one month prior.   monthly_revenue_field_demonstration_usage From 2018-03-15 to present: Available monthly on the 15th day of the month by 24:00 UTC.   monthly_revenue_flexible_payment_schedule From 2018-11-15 to present: Available monthly on the 15th day of the month by 24:00 UTC.   disbursed_amount_by_product From 2015-01-26 to present: Available every 30 days by 24:00 UTC.   disbursed_amount_by_product_with_uncollected_funds From 2012-04-19 to 2015-01-25: Available every 30 days by 24:00 UTC. From 2015-01-26 to present: This data set was split into three data sets: disbursed_amount_by_product, disbursed_amount_by_age_of_uncollected_funds, and disbursed_amount_by_age_of_disbursed_funds.   disbursed_amount_by_instance_hours From 2012-09-04 to present: Available every 30 days by 24:00 UTC.   disbursed_amount_by_customer_geo From 2012-04-19 to present: Available every 30 days by 24:00 UTC.   disbursed_amount_by_age_of_uncollected_funds From 2015-01-26 to present: Available every 30 days by 24:00 UTC.   disbursed_amount_by_age_of_disbursed_funds From 2015-01-26 to present: Available every 30 days by 24:00 UTC.   disbursed_amount_by_age_of_past_due_funds From 2018-04-07 to present: Available every 30 days by 24:00 UTC.   disbursed_amount_by_uncollected_funds_breakdown From 2019-10-04 to present: Available every 30 days by 24:00 UTC.   customer_profile_by_industry From 2015-10-01 to 2017-06-29: Available daily by 24:00 UTC. From 2017-06-30 to present: This data set is no longer available.   customer_profile_by_revenue From 2015-10-01 to 2017-06-29: Available daily by 24:00 UTC. From 2017-06-30 to present: This data set is no longer available.   customer_profile_by_geography From 2015-10-01 to 2017-06-29: Available daily by 24:00 UTC. From 2017-06-30 to present: This data set is no longer available.   sales_compensation_billed_revenue From 2016-12 to 2017-06: Available monthly on the 4th day of the month by 24:00 UTC. Data includes metered transactions (e.g. hourly) from two months prior, and up-front software charges (e.g. annual) from one month prior. From 2017-06 to present: Available monthly on the 15th day of the month by 24:00 UTC. Data includes metered transactions (e.g. hourly) from one month prior, and up-front software charges (e.g. annual) from one month prior.   us_sales_and_use_tax_records From 2017-02-15 to present: Available monthly on the 15th day of the month by 24:00 UTC.   
    */
  var dataSetType: DataSetType = js.native
  /**
    * The name (friendly name, not ARN) of the destination S3 bucket.
    */
  var destinationS3BucketName: DestinationS3BucketName = js.native
  /**
    * (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the output file "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the prefix directory structure does not exist, it will be created. If no prefix is provided, the data set will be published to the S3 bucket root.
    */
  var destinationS3Prefix: js.UndefOr[DestinationS3Prefix] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the provided AWS services.
    */
  var roleNameArn: RoleNameArn = js.native
  /**
    * Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published or if an error has occurred.
    */
  var snsTopicArn: SnsTopicArn = js.native
}

object GenerateDataSetRequest {
  @scala.inline
  def apply(
    dataSetPublicationDate: DataSetPublicationDate,
    dataSetType: DataSetType,
    destinationS3BucketName: DestinationS3BucketName,
    roleNameArn: RoleNameArn,
    snsTopicArn: SnsTopicArn,
    customerDefinedValues: CustomerDefinedValues = null,
    destinationS3Prefix: DestinationS3Prefix = null
  ): GenerateDataSetRequest = {
    val __obj = js.Dynamic.literal(dataSetPublicationDate = dataSetPublicationDate.asInstanceOf[js.Any], dataSetType = dataSetType.asInstanceOf[js.Any], destinationS3BucketName = destinationS3BucketName.asInstanceOf[js.Any], roleNameArn = roleNameArn.asInstanceOf[js.Any], snsTopicArn = snsTopicArn.asInstanceOf[js.Any])
    if (customerDefinedValues != null) __obj.updateDynamic("customerDefinedValues")(customerDefinedValues.asInstanceOf[js.Any])
    if (destinationS3Prefix != null) __obj.updateDynamic("destinationS3Prefix")(destinationS3Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateDataSetRequest]
  }
}

