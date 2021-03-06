package typings.atOracleOraclejet.ojinputtextMod

import typings.atOracleOraclejet.Anon_Action
import typings.atOracleOraclejet.Anon_ActionElement
import typings.atOracleOraclejet.atOracleOraclejetMod.JetElementCustomEvent
import typings.atOracleOraclejet.atOracleOraclejetStrings.converter
import typings.atOracleOraclejet.atOracleOraclejetStrings.converterChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.rawValueChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.rows
import typings.atOracleOraclejet.atOracleOraclejetStrings.rowsChanged
import typings.atOracleOraclejet.atOracleOraclejetStrings.valueChanged
import typings.atOracleOraclejet.ojinputtextMod.ojTextArea.ojAnimateEnd
import typings.atOracleOraclejet.ojinputtextMod.ojTextArea.ojAnimateStart
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import typings.atOracleOraclejet.ojvalidationDashBaseMod.Validation.RegisteredConverter
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTextArea
  extends inputBase[js.Any, ojTextAreaSettableProperties, js.Any, js.Any] {
  var converter: Converter[_] | RegisteredConverter | Null = js.native
  var onConverterChanged: (js.Function1[/* event */ JetElementCustomEvent[Converter[_] | RegisteredConverter | Null], _]) | Null = js.native
  @JSName("onOjAnimateEnd")
  var onOjAnimateEnd_ojTextArea: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
  @JSName("onOjAnimateStart")
  var onOjAnimateStart_ojTextArea: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
  var onRowsChanged: (js.Function1[/* event */ JetElementCustomEvent[Double], _]) | Null = js.native
  var rows: Double = js.native
  def addEventListener(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojinputtext.inputBase<any, @oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojTextAreaSettableProperties, any, any>['rawValue'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: rawValueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojinputtext.inputBase<any, @oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojTextAreaSettableProperties, any, any>['rawValue'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojeditablevalue.editableValue<any, @oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojTextAreaSettableProperties, any, any>['value'] */ js.Any
      ], 
      _
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: valueChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[
        /* import warning: importer.ImportType#apply Failed type conversion: @oracle/oraclejet.@oracle/oraclejet/ojeditablevalue.editableValue<any, @oracle/oraclejet.@oracle/oraclejet/ojinputtext.ojTextAreaSettableProperties, any, any>['value'] */ js.Any
      ], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Converter[_] | RegisteredConverter | Null], 
      _
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_converterChanged(
    `type`: converterChanged,
    listener: js.ThisFunction1[
      /* this */ HTMLElement, 
      /* ev */ JetElementCustomEvent[Converter[_] | RegisteredConverter | Null], 
      _
    ],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsChanged(
    `type`: rowsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rowsChanged(
    `type`: rowsChanged,
    listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double], _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("getProperty")
  def getProperty_converter(property: converter): Converter[_] | RegisteredConverter | Null = js.native
  @JSName("getProperty")
  def getProperty_rows(property: rows): Double = js.native
  def setProperties(properties: ojTextAreaSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: Converter[_]): Unit = js.native
  @JSName("setProperty")
  def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
  @JSName("setProperty")
  def setProperty_rows(property: rows, value: Double): Unit = js.native
}

@JSImport("@oracle/oraclejet/ojinputtext", "ojTextArea")
@js.native
object ojTextArea extends js.Object {
  type ojAnimateEnd = CustomEvent[Anon_Action]
  type ojAnimateStart = CustomEvent[Anon_ActionElement]
}

