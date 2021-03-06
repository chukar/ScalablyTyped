package typings.atTensorflowTfjsDashCore.distBackendsBackendMod

import typings.atTensorflowTfjsDashCore.Anon_Unreliable
import typings.atTensorflowTfjsDashCore.distTensorMod.DataId
import typings.atTensorflowTfjsDashCore.distTypesMod.BackendValues
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TensorStorage extends js.Object {
  def disposeData(dataId: DataId): Unit
  def memory(): Anon_Unreliable
  def move(dataId: DataId, values: BackendValues, shape: js.Array[Double], dtype: DataType): Unit
  /** Returns number of data ids currently in the storage. */
  def numDataIds(): Double
  def read(dataId: DataId): js.Promise[BackendValues]
  def readSync(dataId: DataId): BackendValues
  def write(values: BackendValues, shape: js.Array[Double], dtype: DataType): DataId
}

object TensorStorage {
  @scala.inline
  def apply(
    disposeData: DataId => Unit,
    memory: () => Anon_Unreliable,
    move: (DataId, BackendValues, js.Array[Double], DataType) => Unit,
    numDataIds: () => Double,
    read: DataId => js.Promise[BackendValues],
    readSync: DataId => BackendValues,
    write: (BackendValues, js.Array[Double], DataType) => DataId
  ): TensorStorage = {
    val __obj = js.Dynamic.literal(disposeData = js.Any.fromFunction1(disposeData), memory = js.Any.fromFunction0(memory), move = js.Any.fromFunction4(move), numDataIds = js.Any.fromFunction0(numDataIds), read = js.Any.fromFunction1(read), readSync = js.Any.fromFunction1(readSync), write = js.Any.fromFunction3(write))
  
    __obj.asInstanceOf[TensorStorage]
  }
}

