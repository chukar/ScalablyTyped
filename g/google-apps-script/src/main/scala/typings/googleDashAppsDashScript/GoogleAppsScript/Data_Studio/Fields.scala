package typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a set of Fields for a community connector. This set of fields define which
  * dimensions and metrics can be used in Data Studio.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var fields = cc.getFields();
  *     var types = cc.FieldType;
  *
  *     var field1 = fields.newDimension()
  *       // Set other properties as needed.
  *       .setId('field1_id');
  */
trait Fields extends js.Object {
  def asArray(): js.Array[Field]
  def build(): js.Array[_]
  def forIds(ids: js.Array[String]): Fields
  def getDefaultDimension(): Field
  def getDefaultMetric(): Field
  def getFieldById(fieldId: String): Field
  def newDimension(): Field
  def newMetric(): Field
  def setDefaultDimension(fieldId: String): Unit
  def setDefaultMetric(fieldId: String): Unit
}

object Fields {
  @scala.inline
  def apply(
    asArray: () => js.Array[Field],
    build: () => js.Array[_],
    forIds: js.Array[String] => Fields,
    getDefaultDimension: () => Field,
    getDefaultMetric: () => Field,
    getFieldById: String => Field,
    newDimension: () => Field,
    newMetric: () => Field,
    setDefaultDimension: String => Unit,
    setDefaultMetric: String => Unit
  ): Fields = {
    val __obj = js.Dynamic.literal(asArray = js.Any.fromFunction0(asArray), build = js.Any.fromFunction0(build), forIds = js.Any.fromFunction1(forIds), getDefaultDimension = js.Any.fromFunction0(getDefaultDimension), getDefaultMetric = js.Any.fromFunction0(getDefaultMetric), getFieldById = js.Any.fromFunction1(getFieldById), newDimension = js.Any.fromFunction0(newDimension), newMetric = js.Any.fromFunction0(newMetric), setDefaultDimension = js.Any.fromFunction1(setDefaultDimension), setDefaultMetric = js.Any.fromFunction1(setDefaultMetric))
  
    __obj.asInstanceOf[Fields]
  }
}

