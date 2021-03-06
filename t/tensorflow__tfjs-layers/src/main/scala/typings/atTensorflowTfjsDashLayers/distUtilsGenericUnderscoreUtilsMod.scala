package typings.atTensorflowTfjsDashLayers

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.serialization.Serializable
import typings.atTensorflowTfjsDashCore.distOpsFusedUnderscoreUtilMod.Activation
import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDictValue
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersNumbers.`-1`
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersNumbers.`0`
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/utils/generic_utils", JSImport.Namespace)
@js.native
object distUtilsGenericUnderscoreUtilsMod extends js.Object {
  def assert(`val`: Boolean): Unit = js.native
  def assert(`val`: Boolean, message: String): Unit = js.native
  def assertPositiveInteger(value: js.Array[Double], name: String): Unit = js.native
  def assertPositiveInteger(value: Double, name: String): Unit = js.native
  def checkArrayTypeAndLength(x: js.Any, expectedType: String): Boolean = js.native
  def checkArrayTypeAndLength(x: js.Any, expectedType: String, minLength: Double): Boolean = js.native
  def checkArrayTypeAndLength(x: js.Any, expectedType: String, minLength: Double, maxLength: Double): Boolean = js.native
  def checkStringTypeUnionValue(values: js.Array[String], label: String, value: String): Unit = js.native
  def count[T](array: js.Array[T], refernce: T): Double = js.native
  def debounce[T](f: js.Function1[/* repeated */ js.Object, T], waitMs: Double): js.Function1[/* repeated */ js.Object, T] = js.native
  def deserializeKerasObject(identifier: String): js.Any = js.native
  def deserializeKerasObject(identifier: String, moduleObjects: StringDictionary[js.Any]): js.Any = js.native
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any]
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any],
    printableModuleName: String
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: String,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any],
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = js.native
  def deserializeKerasObject(identifier: ConfigDict): js.Any = js.native
  def deserializeKerasObject(identifier: ConfigDict, moduleObjects: StringDictionary[js.Any]): js.Any = js.native
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any]
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any],
    printableModuleName: String
  ): js.Any = js.native
  def deserializeKerasObject(
    identifier: ConfigDict,
    moduleObjects: StringDictionary[js.Any],
    customObjects: StringDictionary[js.Any],
    printableModuleName: String,
    fastWeightInit: Boolean
  ): js.Any = js.native
  def formatAsFriendlyString(value: js.Any): String = js.native
  def isObjectEmpty(obj: js.Object): Boolean = js.native
  def mapActivationToFusedKernel(activationName: String): Activation = js.native
  def numberCompare(a: Double, b: Double): `0` | `1` | `-1` = js.native
  def objectListUid(objs: js.Any): String = js.native
  def objectListUid(objs: js.Array[_]): String = js.native
  def pyListRepeat(value: js.Any, numValues: Double): js.Array[_] = js.native
  def reverseNumberCompare(a: Double, b: Double): Double = js.native
  def serializeKerasObject(instance: Serializable): ConfigDictValue = js.native
  def singletonOrArray[T](xs: js.Array[T]): T | js.Array[T] = js.native
  def stringToDType(dtype: String): DataType = js.native
  def stringsEqual(xs: js.Array[String], ys: js.Array[String]): Boolean = js.native
  def toCamelCase(identifier: String): String = js.native
  def toList(x: js.Any): js.Array[_] = js.native
  def toSnakeCase(name: String): String = js.native
  def unique[T](xs: js.Array[T]): js.Array[T] = js.native
}

