package typings.atUirouterCore

import typings.atUirouterCore.atUirouterCoreStrings.auto
import typings.atUirouterCore.libParamsInterfaceMod.ParamTypeDefinition
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/params/paramType", JSImport.Namespace)
@js.native
object libParamsParamTypeMod extends js.Object {
  @js.native
  class ParamType protected () extends ParamTypeDefinition {
    /**
      * @param def  A configuration object which contains the custom type definition.  The object's
      *        properties will override the default methods and/or pattern in `ParamType`'s public interface.
      * @returns a new ParamType object
      */
    def this(`def`: ParamTypeDefinition) = this()
    /** @inheritdoc */
    @JSName("dynamic")
    var dynamic_ParamType: Boolean = js.native
    /** @inheritdoc */
    @JSName("inherit")
    var inherit_ParamType: Boolean = js.native
    /** The name/id of the parameter type */
    var name: String = js.native
    /** @inheritdoc */
    @JSName("pattern")
    var pattern_ParamType: RegExp = js.native
    /** @inheritdoc */
    @JSName("raw")
    var raw_ParamType: Boolean = js.native
    /**
      * Wraps an existing custom ParamType as an array of ParamType, depending on 'mode'.
      * e.g.:
      * - urlmatcher pattern "/path?{queryParam[]:int}"
      * - url: "/path?queryParam=1&queryParam=2
      * - $stateParams.queryParam will be [1, 2]
      * if `mode` is "auto", then
      * - url: "/path?queryParam=1 will create $stateParams.queryParam: 1
      * - url: "/path?queryParam=1&queryParam=2 will create $stateParams.queryParam: [1, 2]
      */
    @JSName("$asArray")
    def $asArray(mode: Boolean, isSearch: Boolean): js.Any = js.native
    @JSName("$asArray")
    def $asArray_auto(mode: auto, isSearch: Boolean): js.Any = js.native
    /** Given an encoded string, or a decoded object, returns a decoded object */
    @JSName("$normalize")
    def $normalize(`val`: js.Any): js.Any = js.native
    @JSName("$subPattern")
    def $subPattern(): String = js.native
  }
  
}

