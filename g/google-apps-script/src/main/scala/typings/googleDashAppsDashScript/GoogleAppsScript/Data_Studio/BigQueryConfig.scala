package typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A configuration object for a native BigQuery connector. Return this object from getData()
  * for Data Studio to query BigQuery for the connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var types = cc.BigQueryParameterType;
  *
  *     var bqConfig = cc.newBigQueryConfig()
  *       .setBillingProjectId('billingProjectId')
  *       .setQuery('queryString')
  *       .setUseStandardSql(true)
  *       .setAccessToken('accessToken')
  *       .addQueryParameter('dob', types.STRING, '01011990')
  *       .build();
  */
trait BigQueryConfig extends js.Object {
  def addQueryParameter(name: String, `type`: BigQueryParameterType, value: String): BigQueryConfig
  def build(): Config
  def printJson(): String
  def setAccessToken(accessToken: String): BigQueryConfig
  def setBillingProjectId(billingProjectId: String): BigQueryConfig
  def setQuery(query: String): BigQueryConfig
  def setUseStandardSql(useStandardSql: Boolean): BigQueryConfig
}

object BigQueryConfig {
  @scala.inline
  def apply(
    addQueryParameter: (String, BigQueryParameterType, String) => BigQueryConfig,
    build: () => Config,
    printJson: () => String,
    setAccessToken: String => BigQueryConfig,
    setBillingProjectId: String => BigQueryConfig,
    setQuery: String => BigQueryConfig,
    setUseStandardSql: Boolean => BigQueryConfig
  ): BigQueryConfig = {
    val __obj = js.Dynamic.literal(addQueryParameter = js.Any.fromFunction3(addQueryParameter), build = js.Any.fromFunction0(build), printJson = js.Any.fromFunction0(printJson), setAccessToken = js.Any.fromFunction1(setAccessToken), setBillingProjectId = js.Any.fromFunction1(setBillingProjectId), setQuery = js.Any.fromFunction1(setQuery), setUseStandardSql = js.Any.fromFunction1(setUseStandardSql))
  
    __obj.asInstanceOf[BigQueryConfig]
  }
}

