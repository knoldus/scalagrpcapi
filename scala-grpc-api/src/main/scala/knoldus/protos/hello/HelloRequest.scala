// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package knoldus.protos.hello

/** The request message containing the user's name.
  */
@SerialVersionUID(0L)
final case class HelloRequest(
    name: _root_.scala.Predef.String = "",
    last: _root_.scala.Option[knoldus.protos.hello.HelloLastName] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[HelloRequest] with scalapb.lenses.Updatable[HelloRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      if (last.isDefined) {
        val __value = last.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = name
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      last.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): knoldus.protos.hello.HelloRequest = {
      var __name = this.name
      var __last = this.last
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readString()
          case 18 =>
            __last = Option(_root_.scalapb.LiteParser.readMessage(_input__, __last.getOrElse(knoldus.protos.hello.HelloLastName.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      knoldus.protos.hello.HelloRequest(
          name = __name,
          last = __last
      )
    }
    def withName(__v: _root_.scala.Predef.String): HelloRequest = copy(name = __v)
    def getLast: knoldus.protos.hello.HelloLastName = last.getOrElse(knoldus.protos.hello.HelloLastName.defaultInstance)
    def clearLast: HelloRequest = copy(last = None)
    def withLast(__v: knoldus.protos.hello.HelloLastName): HelloRequest = copy(last = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => last.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => last.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = knoldus.protos.hello.HelloRequest
}

object HelloRequest extends scalapb.GeneratedMessageCompanion[knoldus.protos.hello.HelloRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[knoldus.protos.hello.HelloRequest] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): knoldus.protos.hello.HelloRequest = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    knoldus.protos.hello.HelloRequest(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[knoldus.protos.hello.HelloLastName]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[knoldus.protos.hello.HelloRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      knoldus.protos.hello.HelloRequest(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[knoldus.protos.hello.HelloLastName]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = HelloProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = HelloProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = knoldus.protos.hello.HelloLastName
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = knoldus.protos.hello.HelloRequest(
  )
  final val NAME_FIELD_NUMBER = 1
  final val LAST_FIELD_NUMBER = 2
  def of(
    name: _root_.scala.Predef.String,
    last: _root_.scala.Option[knoldus.protos.hello.HelloLastName]
  ): _root_.knoldus.protos.hello.HelloRequest = _root_.knoldus.protos.hello.HelloRequest(
    name,
    last
  )
}
