// Generated by Cap'n Proto compiler, DO NOT EDIT
// source: Request.capnp

package org.ericsson2017.protocol.test;

public final class RequestClass {
  public static class Request {
    public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short)1,(short)2);
    public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
      public Factory() {
      }
      public final Reader constructReader(org.capnproto.SegmentReader segment, int data,int pointers, int dataSize, short pointerCount, int nestingLimit) {
        return new Reader(segment,data,pointers,dataSize,pointerCount,nestingLimit);
      }
      public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data,int pointers, int dataSize, short pointerCount) {
        return new Builder(segment, data, pointers, dataSize, pointerCount);
      }
      public final org.capnproto.StructSize structSize() {
        return Request.STRUCT_SIZE;
      }
      public final Reader asReader(Builder builder) {
        return builder.asReader();
      }
    }
    public static final Factory factory = new Factory();
    public static final org.capnproto.StructList.Factory<Builder,Reader> listFactory =
      new org.capnproto.StructList.Factory<Builder, Reader>(factory);
    public static final class Builder extends org.capnproto.StructBuilder {
      Builder(org.capnproto.SegmentBuilder segment, int data, int pointers,int dataSize, short pointerCount){
        super(segment, data, pointers, dataSize, pointerCount);
      }
      public Which which() {
        switch(_getShortField(0)) {
          case 0 : return Which.LOGIN;
          case 1 : return Which.BUGFIX;
          default: return Which._NOT_IN_SCHEMA;
        }
      }
      public final Reader asReader() {
        return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
      }
      public final boolean isLogin() {
        return which() == Request.Which.LOGIN;
      }
      public final Login.Builder getLogin() {
        return new Request.Login.Builder(segment, data, pointers, dataSize, pointerCount);
      }
      public final Login.Builder initLogin() {
        _setShortField(0, (short)Request.Which.LOGIN.ordinal());
        _clearPointerField(0);
        _clearPointerField(1);
  return new Request.Login.Builder(segment, data, pointers, dataSize, pointerCount);
      }

      public final boolean isBugfix() {
        return which() == Request.Which.BUGFIX;
      }
      public final org.ericsson2017.protocol.test.BugfixClass.Bugfix.Builder getBugfix() {
        assert which() == Request.Which.BUGFIX:
                    "Must check which() before get()ing a union member.";
        return _getPointerField(org.ericsson2017.protocol.test.BugfixClass.Bugfix.factory, 0, null, 0);
      }
      public final void setBugfix(org.ericsson2017.protocol.test.BugfixClass.Bugfix.Reader value) {
        _setShortField(0, (short)Request.Which.BUGFIX.ordinal());
        _setPointerField(org.ericsson2017.protocol.test.BugfixClass.Bugfix.factory,0, value);
      }
      public final org.ericsson2017.protocol.test.BugfixClass.Bugfix.Builder initBugfix() {
        _setShortField(0, (short)Request.Which.BUGFIX.ordinal());
        return _initPointerField(org.ericsson2017.protocol.test.BugfixClass.Bugfix.factory,0, 0);
      }
    }

    public static final class Reader extends org.capnproto.StructReader {
      Reader(org.capnproto.SegmentReader segment, int data, int pointers,int dataSize, short pointerCount, int nestingLimit){
        super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
      }

      public Which which() {
        switch(_getShortField(0)) {
          case 0 : return Which.LOGIN;
          case 1 : return Which.BUGFIX;
          default: return Which._NOT_IN_SCHEMA;
        }
      }
      public final boolean isLogin() {
        return which() == Request.Which.LOGIN;
      }
      public Login.Reader getLogin() {
        return new Request.Login.Reader(segment, data, pointers, dataSize, pointerCount, nestingLimit);
      }

      public final boolean isBugfix() {
        return which() == Request.Which.BUGFIX;
      }
      public boolean hasBugfix() {
        return !_pointerFieldIsNull(0);
      }
      public org.ericsson2017.protocol.test.BugfixClass.Bugfix.Reader getBugfix() {
        assert which() == Request.Which.BUGFIX:
                    "Must check which() before get()ing a union member.";
        return _getPointerField(org.ericsson2017.protocol.test.BugfixClass.Bugfix.factory,0,null, 0);
      }

    }

    public enum Which {
      LOGIN,
      BUGFIX,
      _NOT_IN_SCHEMA,
    }
    public static class Login {
      public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short)1,(short)2);
      public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
        public Factory() {
        }
        public final Reader constructReader(org.capnproto.SegmentReader segment, int data,int pointers, int dataSize, short pointerCount, int nestingLimit) {
          return new Reader(segment,data,pointers,dataSize,pointerCount,nestingLimit);
        }
        public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data,int pointers, int dataSize, short pointerCount) {
          return new Builder(segment, data, pointers, dataSize, pointerCount);
        }
        public final org.capnproto.StructSize structSize() {
          return Request.Login.STRUCT_SIZE;
        }
        public final Reader asReader(Builder builder) {
          return builder.asReader();
        }
      }
      public static final Factory factory = new Factory();
      public static final org.capnproto.StructList.Factory<Builder,Reader> listFactory =
        new org.capnproto.StructList.Factory<Builder, Reader>(factory);
      public static final class Builder extends org.capnproto.StructBuilder {
        Builder(org.capnproto.SegmentBuilder segment, int data, int pointers,int dataSize, short pointerCount){
          super(segment, data, pointers, dataSize, pointerCount);
        }
        public final Reader asReader() {
          return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
        }
        public final boolean hasTeam() {
          return !_pointerFieldIsNull(0);
        }
        public final org.capnproto.Text.Builder getTeam() {
          return _getPointerField(org.capnproto.Text.factory, 0, null, 0, 0);
        }
        public final void setTeam(org.capnproto.Text.Reader value) {
          _setPointerField(org.capnproto.Text.factory, 0, value);
        }
        public final void setTeam(String value) {
          _setPointerField(org.capnproto.Text.factory, 0, new org.capnproto.Text.Reader(value));
        }
        public final org.capnproto.Text.Builder initTeam(int size) {
          return _initPointerField(org.capnproto.Text.factory, 0, size);
        }
        public final boolean hasHash() {
          return !_pointerFieldIsNull(1);
        }
        public final org.capnproto.Text.Builder getHash() {
          return _getPointerField(org.capnproto.Text.factory, 1, null, 0, 0);
        }
        public final void setHash(org.capnproto.Text.Reader value) {
          _setPointerField(org.capnproto.Text.factory, 1, value);
        }
        public final void setHash(String value) {
          _setPointerField(org.capnproto.Text.factory, 1, new org.capnproto.Text.Reader(value));
        }
        public final org.capnproto.Text.Builder initHash(int size) {
          return _initPointerField(org.capnproto.Text.factory, 1, size);
        }
      }

      public static final class Reader extends org.capnproto.StructReader {
        Reader(org.capnproto.SegmentReader segment, int data, int pointers,int dataSize, short pointerCount, int nestingLimit){
          super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
        }

        public boolean hasTeam() {
          return !_pointerFieldIsNull(0);
        }
        public org.capnproto.Text.Reader getTeam() {
          return _getPointerField(org.capnproto.Text.factory, 0, null, 0, 0);
        }

        public boolean hasHash() {
          return !_pointerFieldIsNull(1);
        }
        public org.capnproto.Text.Reader getHash() {
          return _getPointerField(org.capnproto.Text.factory, 1, null, 0, 0);
        }

      }

    }


  }



public static final class Schemas {
public static final org.capnproto.SegmentReader b_b5bfa4a18a307b4e =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u004e\u007b\u0030\u008a\u00a1\u00a4\u00bf\u00b5" +
   "\u000e\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u0095\u00d5\u00db\u00e1\u006c\u003a\u00c2\u00ec" +
   "\u0002\u0000\u0007\u0000\u0000\u0000\u0002\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u00b2\u0000\u0000\u0000" +
   "\u001d\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0019\u0000\u0000\u0000\u0077\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0052\u0065\u0071\u0075\u0065\u0073\u0074\u002e" +
   "\u0063\u0061\u0070\u006e\u0070\u003a\u0052\u0065" +
   "\u0071\u0075\u0065\u0073\u0074\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u0008\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
   "\u0000\u0000\u00ff\u00ff\u0000\u0000\u0000\u0000" +
   "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0006\u00e7\u00c4\u00ca\u0064\u0012\u0051\u00c4" +
   "\u0029\u0000\u0000\u0000\u0032\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0001\u0000\u00fe\u00ff\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0011\u0000\u0000\u0000\u003a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0018\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u006c\u006f\u0067\u0069\u006e\u0000\u0000\u0000" +
   "\u0062\u0075\u0067\u0066\u0069\u0078\u0000\u0000" +
   "\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u005d\u00a7\u00ee\u0011\u0065\u007a\u00ec\u00f0" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
public static final org.capnproto.SegmentReader b_c4511264cac4e706 =
   org.capnproto.GeneratedClassSupport.decodeRawBytes(
   "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
   "\u0006\u00e7\u00c4\u00ca\u0064\u0012\u0051\u00c4" +
   "\u0016\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
   "\u004e\u007b\u0030\u008a\u00a1\u00a4\u00bf\u00b5" +
   "\u0002\u0000\u0007\u0000\u0001\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0015\u0000\u0000\u0000\u00e2\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0019\u0000\u0000\u0000\u0077\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0052\u0065\u0071\u0075\u0065\u0073\u0074\u002e" +
   "\u0063\u0061\u0070\u006e\u0070\u003a\u0052\u0065" +
   "\u0071\u0075\u0065\u0073\u0074\u002e\u006c\u006f" +
   "\u0067\u0069\u006e\u0000\u0000\u0000\u0000\u0000" +
   "\u0008\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0029\u0000\u0000\u0000\u002a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0024\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0030\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000" +
   "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u002d\u0000\u0000\u0000\u002a\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0028\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
   "\u0034\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
   "\u0074\u0065\u0061\u006d\u0000\u0000\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0068\u0061\u0073\u0068\u0000\u0000\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
   "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
}
}

