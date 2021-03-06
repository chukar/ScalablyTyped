package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializer extends js.Object {
  /**
    * Nested argument that specifies converting data to the ORC format before storing it in Amazon S3. For more information, see [Apache ORC](https://orc.apache.org/docs/). More details below.
    */
  var orcSerDe: js.UndefOr[
    FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe
  ] = js.native
  /**
    * Nested argument that specifies converting data to the Parquet format before storing it in Amazon S3. For more information, see [Apache Parquet](https://parquet.apache.org/documentation/latest/). More details below.
    */
  var parquetSerDe: js.UndefOr[
    FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe
  ] = js.native
}

object FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializer {
  @scala.inline
  def apply(
    orcSerDe: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe = null,
    parquetSerDe: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe = null
  ): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializer = {
    val __obj = js.Dynamic.literal()
    if (orcSerDe != null) __obj.updateDynamic("orcSerDe")(orcSerDe.asInstanceOf[js.Any])
    if (parquetSerDe != null) __obj.updateDynamic("parquetSerDe")(parquetSerDe.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializer]
  }
}

