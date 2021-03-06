package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRekognitionMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type Assets = js.Array[Asset]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - java.lang.String
  */
  type Attribute = _Attribute | java.lang.String
  type Attributes = js.Array[Attribute]
  type Boolean = scala.Boolean
  type CelebrityList = js.Array[Celebrity]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ID
    - typings.awsDashSdk.awsDashSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type CelebrityRecognitionSortBy = _CelebrityRecognitionSortBy | java.lang.String
  type CelebrityRecognitions = js.Array[CelebrityRecognition]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CollectionId = java.lang.String
  type CollectionIdList = js.Array[CollectionId]
  type CompareFacesMatchList = js.Array[CompareFacesMatch]
  type CompareFacesUnmatchList = js.Array[ComparedFace]
  type ComparedFaceList = js.Array[ComparedFace]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FreeOfPersonallyIdentifiableInformation
    - typings.awsDashSdk.awsDashSdkStrings.FreeOfAdultContent
    - java.lang.String
  */
  type ContentClassifier = _ContentClassifier | java.lang.String
  type ContentClassifiers = js.Array[ContentClassifier]
  type ContentModerationDetections = js.Array[ContentModerationDetection]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NAME
    - typings.awsDashSdk.awsDashSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type ContentModerationSortBy = _ContentModerationSortBy | java.lang.String
  type CustomLabels = js.Array[CustomLabel]
  type DateTime = Date
  type Degree = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HAPPY
    - typings.awsDashSdk.awsDashSdkStrings.SAD
    - typings.awsDashSdk.awsDashSdkStrings.ANGRY
    - typings.awsDashSdk.awsDashSdkStrings.CONFUSED
    - typings.awsDashSdk.awsDashSdkStrings.DISGUSTED
    - typings.awsDashSdk.awsDashSdkStrings.SURPRISED
    - typings.awsDashSdk.awsDashSdkStrings.CALM
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN
    - typings.awsDashSdk.awsDashSdkStrings.FEAR
    - java.lang.String
  */
  type EmotionName = _EmotionName | java.lang.String
  type Emotions = js.Array[Emotion]
  type ExtendedPaginationToken = java.lang.String
  type ExternalImageId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DEFAULT
    - typings.awsDashSdk.awsDashSdkStrings.ALL
    - java.lang.String
  */
  type FaceAttributes = _FaceAttributes | java.lang.String
  type FaceDetailList = js.Array[FaceDetail]
  type FaceDetections = js.Array[FaceDetection]
  type FaceId = java.lang.String
  type FaceIdList = js.Array[FaceId]
  type FaceList = js.Array[Face]
  type FaceMatchList = js.Array[FaceMatch]
  type FaceModelVersionList = js.Array[String]
  type FaceRecordList = js.Array[FaceRecord]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INDEX
    - typings.awsDashSdk.awsDashSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type FaceSearchSortBy = _FaceSearchSortBy | java.lang.String
  type Float = Double
  type FlowDefinitionArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Male
    - typings.awsDashSdk.awsDashSdkStrings.Female
    - java.lang.String
  */
  type GenderType = _GenderType | java.lang.String
  type HumanLoopActivationConditionsEvaluationResults = java.lang.String
  type HumanLoopActivationReason = java.lang.String
  type HumanLoopActivationReasons = js.Array[HumanLoopActivationReason]
  type HumanLoopArn = java.lang.String
  type HumanLoopName = java.lang.String
  type ImageBlob = Buffer | Uint8Array | Blob | java.lang.String
  type ImageId = java.lang.String
  type InferenceUnits = Double
  type Instances = js.Array[Instance]
  type JobId = java.lang.String
  type JobTag = java.lang.String
  type KinesisDataArn = java.lang.String
  type KinesisVideoArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NAME
    - typings.awsDashSdk.awsDashSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type LabelDetectionSortBy = _LabelDetectionSortBy | java.lang.String
  type LabelDetections = js.Array[LabelDetection]
  type Labels = js.Array[Label]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.eyeLeft
    - typings.awsDashSdk.awsDashSdkStrings.eyeRight
    - typings.awsDashSdk.awsDashSdkStrings.nose
    - typings.awsDashSdk.awsDashSdkStrings.mouthLeft
    - typings.awsDashSdk.awsDashSdkStrings.mouthRight
    - typings.awsDashSdk.awsDashSdkStrings.leftEyeBrowLeft
    - typings.awsDashSdk.awsDashSdkStrings.leftEyeBrowRight
    - typings.awsDashSdk.awsDashSdkStrings.leftEyeBrowUp
    - typings.awsDashSdk.awsDashSdkStrings.rightEyeBrowLeft
    - typings.awsDashSdk.awsDashSdkStrings.rightEyeBrowRight
    - typings.awsDashSdk.awsDashSdkStrings.rightEyeBrowUp
    - typings.awsDashSdk.awsDashSdkStrings.leftEyeLeft
    - typings.awsDashSdk.awsDashSdkStrings.leftEyeRight
    - typings.awsDashSdk.awsDashSdkStrings.leftEyeUp
    - typings.awsDashSdk.awsDashSdkStrings.leftEyeDown
    - typings.awsDashSdk.awsDashSdkStrings.rightEyeLeft
    - typings.awsDashSdk.awsDashSdkStrings.rightEyeRight
    - typings.awsDashSdk.awsDashSdkStrings.rightEyeUp
    - typings.awsDashSdk.awsDashSdkStrings.rightEyeDown
    - typings.awsDashSdk.awsDashSdkStrings.noseLeft
    - typings.awsDashSdk.awsDashSdkStrings.noseRight
    - typings.awsDashSdk.awsDashSdkStrings.mouthUp
    - typings.awsDashSdk.awsDashSdkStrings.mouthDown
    - typings.awsDashSdk.awsDashSdkStrings.leftPupil
    - typings.awsDashSdk.awsDashSdkStrings.rightPupil
    - typings.awsDashSdk.awsDashSdkStrings.upperJawlineLeft
    - typings.awsDashSdk.awsDashSdkStrings.midJawlineLeft
    - typings.awsDashSdk.awsDashSdkStrings.chinBottom
    - typings.awsDashSdk.awsDashSdkStrings.midJawlineRight
    - typings.awsDashSdk.awsDashSdkStrings.upperJawlineRight
    - java.lang.String
  */
  type LandmarkType = _LandmarkType | java.lang.String
  type Landmarks = js.Array[Landmark]
  type MaxFaces = Double
  type MaxFacesToIndex = Double
  type MaxResults = Double
  type ModerationLabels = js.Array[ModerationLabel]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ROTATE_0
    - typings.awsDashSdk.awsDashSdkStrings.ROTATE_90
    - typings.awsDashSdk.awsDashSdkStrings.ROTATE_180
    - typings.awsDashSdk.awsDashSdkStrings.ROTATE_270
    - java.lang.String
  */
  type OrientationCorrection = _OrientationCorrection | java.lang.String
  type PageSize = Double
  type PaginationToken = java.lang.String
  type Parents = js.Array[Parent]
  type Percent = Double
  type PersonDetections = js.Array[PersonDetection]
  type PersonIndex = Double
  type PersonMatches = js.Array[PersonMatch]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INDEX
    - typings.awsDashSdk.awsDashSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type PersonTrackingSortBy = _PersonTrackingSortBy | java.lang.String
  type Polygon = js.Array[Point]
  type ProjectArn = java.lang.String
  type ProjectDescriptions = js.Array[ProjectDescription]
  type ProjectName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.CREATED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - java.lang.String
  */
  type ProjectStatus = _ProjectStatus | java.lang.String
  type ProjectVersionArn = java.lang.String
  type ProjectVersionDescriptions = js.Array[ProjectVersionDescription]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TRAINING_IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.TRAINING_COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.TRAINING_FAILED
    - typings.awsDashSdk.awsDashSdkStrings.STARTING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.STOPPING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPED
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - java.lang.String
  */
  type ProjectVersionStatus = _ProjectVersionStatus | java.lang.String
  type ProjectVersionsPageSize = Double
  type ProjectsPageSize = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.AUTO
    - typings.awsDashSdk.awsDashSdkStrings.LOW
    - typings.awsDashSdk.awsDashSdkStrings.MEDIUM
    - typings.awsDashSdk.awsDashSdkStrings.HIGH
    - java.lang.String
  */
  type QualityFilter = _QualityFilter | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EXCEEDS_MAX_FACES
    - typings.awsDashSdk.awsDashSdkStrings.EXTREME_POSE
    - typings.awsDashSdk.awsDashSdkStrings.LOW_BRIGHTNESS
    - typings.awsDashSdk.awsDashSdkStrings.LOW_SHARPNESS
    - typings.awsDashSdk.awsDashSdkStrings.LOW_CONFIDENCE
    - typings.awsDashSdk.awsDashSdkStrings.SMALL_BOUNDING_BOX
    - typings.awsDashSdk.awsDashSdkStrings.LOW_FACE_QUALITY
    - java.lang.String
  */
  type Reason = _Reason | java.lang.String
  type Reasons = js.Array[Reason]
  type RekognitionUniqueId = java.lang.String
  type RoleArn = java.lang.String
  type S3Bucket = java.lang.String
  type S3KeyPrefix = java.lang.String
  type S3ObjectName = java.lang.String
  type S3ObjectVersion = java.lang.String
  type SNSTopicArn = java.lang.String
  type StatusMessage = java.lang.String
  type StreamProcessorArn = java.lang.String
  type StreamProcessorList = js.Array[StreamProcessor]
  type StreamProcessorName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STOPPED
    - typings.awsDashSdk.awsDashSdkStrings.STARTING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.STOPPING
    - java.lang.String
  */
  type StreamProcessorStatus = _StreamProcessorStatus | java.lang.String
  type String = java.lang.String
  type TextDetectionList = js.Array[TextDetection]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LINE
    - typings.awsDashSdk.awsDashSdkStrings.WORD
    - java.lang.String
  */
  type TextTypes = _TextTypes | java.lang.String
  type Timestamp = Double
  type UInteger = Double
  type ULong = Double
  type UnindexedFaces = js.Array[UnindexedFace]
  type Url = java.lang.String
  type Urls = js.Array[Url]
  type VersionName = java.lang.String
  type VersionNames = js.Array[VersionName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type VideoJobStatus = _VideoJobStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-06-27`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
