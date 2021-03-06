package typings.winrtDashUwp.Windows.Storage.Streams

import typings.winrtDashUwp.Windows.Foundation.IClosable
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sequential stream of bytes to be read. */
trait IInputStream extends IClosable {
  /**
    * Reads data from the stream asynchronously.
    * @param buffer A buffer that may be used to return the bytes that are read. The return value contains the buffer that holds the results.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
}

object IInputStream {
  @scala.inline
  def apply(
    close: () => Unit,
    readAsync: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
  ): IInputStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), readAsync = js.Any.fromFunction3(readAsync))
  
    __obj.asInstanceOf[IInputStream]
  }
}

