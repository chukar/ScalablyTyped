package typings.atTensorflowTfjsDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKernelUnderscoreRegistryMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atTensorflowTfjsDashCore.Anon_Attrs
  import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
  import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
  import typings.atTensorflowTfjsDashCore.distTypesMod.RecursiveArray

  type Attribute = AttributeValue | RecursiveArray[AttributeValue]
  type AttributeValue = Double | (js.Array[Boolean | Double | String]) | Boolean | String | NamedAttrMap
  type DataId = js.Object
  type GradFunc = js.Function2[
    /* dy */ Tensor[Rank] | js.Array[Tensor[Rank]], 
    /* saved */ js.Array[Tensor[Rank]], 
    StringDictionary[js.Function0[Tensor[Rank]]]
  ]
  type KernelDisposeFunc = KernelSetupFunc
  type KernelFunc = js.Function1[/* params */ Anon_Attrs, TensorInfo | js.Array[TensorInfo]]
  type KernelSetupFunc = js.Function1[/* backend */ js.Object, Unit]
  type NamedTensorInfoMap = StringDictionary[TensorInfo]
}
