package typings.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Selector extends js.Object {
  def apply[T](
    SubjectFactory: js.ThisFunction0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ _
    ]
  ): js.Any = js.native
  def apply[T](
    SubjectFactory: js.ThisFunction0[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* this */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> */ _
    ],
    selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any
  ): js.Any = js.native
  def apply[T](
    subjectOrSubjectFactory: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FactoryOrValue<Subject<T>> */ js.Any
  ): js.Any = js.native
}

