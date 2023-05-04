CREATE SCHEMA 消費税;
CREATE TABLE 消費税.計算方式区分
(
    消費税計算方式 CHAR(4)   NOT NULL,
    PRIMARY KEY (消費税計算方式),
    作成日時       TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE 消費税.税率区分
(
    税率区分 CHAR(4)   NOT NULL,
    PRIMARY KEY (税率区分),
    作成日時 TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);


-- <editor-fold desc="顧客スキーマ">
CREATE SCHEMA 顧客;

CREATE TABLE 顧客.顧客
(
    顧客ID   UUID       NOT NULL,
    顧客番号 VARCHAR(8) NOT NULL,
    PRIMARY KEY (顧客ID),
    UNIQUE (顧客番号),
    作成日時 TIMESTAMP  NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE 顧客.顧客リビジョン
(
    顧客ID   UUID      NOT NULL,
    リビジョン    UUID      NOT NULL,
    PRIMARY KEY (顧客ID, リビジョン),
    FOREIGN KEY (顧客ID) REFERENCES 顧客.顧客 (顧客ID),
    作成日時 TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE 顧客._現在の顧客リビジョン
(
    顧客ID   UUID      NOT NULL,
    リビジョン    UUID      NOT NULL,
    PRIMARY KEY (顧客ID),
    FOREIGN KEY (顧客ID, リビジョン) REFERENCES 顧客.顧客リビジョン (顧客ID, リビジョン),
    作成日時 TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE 顧客.顧客名称
(
    顧客ID   UUID        NOT NULL,
    リビジョン    UUID        NOT NULL,
    顧客名   VARCHAR(20) NOT NULL,
    顧客名カナ VARCHAR(40) NOT NULL,
    PRIMARY KEY (顧客ID, リビジョン),
    FOREIGN KEY (顧客ID, リビジョン) REFERENCES 顧客.顧客リビジョン (顧客ID, リビジョン),
    作成日時 TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE SEQUENCE 顧客.顧客番号 START WITH 99000000 NO CYCLE;

CREATE TABLE 顧客.連絡先
(
    顧客ID   UUID        NOT NULL,
    リビジョン    UUID        NOT NULL,
    Eメール     VARCHAR(30) NOT NULL,
    郵便番号 VARCHAR(8)  NOT NULL,
    住所     VARCHAR(40) NOT NULL,
    建物     VARCHAR(40) NOT NULL,
    電話番号 VARCHAR(15) NOT NULL,
    担当者名 VARCHAR(20) NOT NULL,
    担当部署 VARCHAR(20) NOT NULL,
    PRIMARY KEY (顧客ID, リビジョン),
    FOREIGN KEY (顧客ID, リビジョン) REFERENCES 顧客.顧客リビジョン (顧客ID, リビジョン),
    作成日時 TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP
);
-- </editor-fold>

-- <editor-fold desc="販売スキーマ">
CREATE SCHEMA 販売;

CREATE TABLE 販売.販売商品
(
    販売商品ID  UUID        NOT NULL,
    販売商品コード VARCHAR(10) NOT NULL,
    PRIMARY KEY (販売商品ID),
    UNIQUE (販売商品コード),
    作成日時    TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE 販売.販売商品リビジョン
(
    販売商品ID UUID      NOT NULL,
    リビジョン      UUID      NOT NULL,
    PRIMARY KEY (販売商品ID, リビジョン),
    FOREIGN KEY (販売商品ID) REFERENCES 販売.販売商品 (販売商品ID),
    作成日時   TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE 販売._現在の販売商品リビジョン
(
    販売商品ID UUID      NOT NULL,
    リビジョン      UUID      NOT NULL,
    PRIMARY KEY (販売商品ID, リビジョン),
    FOREIGN KEY (販売商品ID, リビジョン) REFERENCES 販売.販売商品リビジョン (販売商品ID, リビジョン),
    作成日時   TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE 販売.販売商品内容
(
    販売商品ID UUID          NOT NULL,
    リビジョン      UUID          NOT NULL,
    商品名称   VARCHAR(40)   NOT NULL,
    商品略称   VARCHAR(30)   NOT NULL,
    販売開始日 DATE          NOT NULL,
    販売終了日 DATE          NOT NULL,
    販売価格   NUMERIC(7)    NOT NULL,
    定価       NUMERIC(7)    NOT NULL,
    色         VARCHAR(5)    NOT NULL,
    サイズ        VARCHAR(5)    NOT NULL,
    説明       VARCHAR(1000) NOT NULL,
    備考       VARCHAR(1000) NOT NULL,
    PRIMARY KEY (販売商品ID, リビジョン),
    FOREIGN KEY (販売商品ID, リビジョン) REFERENCES 販売.販売商品リビジョン (販売商品ID, リビジョン),
    作成日時   TIMESTAMP     NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE SEQUENCE 販売.販売商品コード START WITH 789012481 NO CYCLE;

-- </editor-fold>

-- <editor-fold desc="仕入スキーマ">
CREATE SCHEMA 仕入;

CREATE TABLE 仕入.仕入商品
(
    仕入商品ID  UUID        NOT NULL,
    仕入商品コード VARCHAR(10) NOT NULL,
    PRIMARY KEY (仕入商品ID),
    UNIQUE (仕入商品コード),
    作成日時    TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE 仕入.仕入商品リビジョン
(
    仕入商品ID UUID      NOT NULL,
    リビジョン      UUID      NOT NULL,
    PRIMARY KEY (仕入商品ID, リビジョン),
    FOREIGN KEY (仕入商品ID) REFERENCES 仕入.仕入商品 (仕入商品ID),
    作成日時   TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE 仕入._現在の仕入商品リビジョン
(
    仕入商品ID UUID      NOT NULL,
    リビジョン      UUID      NOT NULL,
    PRIMARY KEY (仕入商品ID, リビジョン),
    FOREIGN KEY (仕入商品ID, リビジョン) REFERENCES 仕入.仕入商品リビジョン (仕入商品ID, リビジョン),
    作成日時   TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE 仕入.仕入商品内容
(
    仕入商品ID UUID        NOT NULL,
    リビジョン      UUID        NOT NULL,
    商品名称   VARCHAR(40) NOT NULL,
    仕入価格   NUMERIC(7)  NOT NULL,
    PRIMARY KEY (仕入商品ID, リビジョン),
    FOREIGN KEY (仕入商品ID, リビジョン) REFERENCES 仕入.仕入商品リビジョン (仕入商品ID, リビジョン),
    作成日時   TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE 仕入.商品仕入先
(
    仕入商品ID     UUID        NOT NULL,
    リビジョン          UUID        NOT NULL,
    仕入先名称     VARCHAR(40) NOT NULL,
    仕入先担当者   VARCHAR(20) NOT NULL,
    仕入先電話番号 VARCHAR(15) NOT NULL,
    PRIMARY KEY (仕入商品ID, リビジョン),
    FOREIGN KEY (仕入商品ID, リビジョン) REFERENCES 仕入.仕入商品リビジョン (仕入商品ID, リビジョン),
    作成日時       TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP
);
-- </editor-fold>


-- <editor-fold desc="受注スキーマ">
CREATE SCHEMA 受注;
CREATE TABLE 受注.受注
(
    受注ID   UUID       NOT NULL,
    受注番号 VARCHAR(8) NOT NULL UNIQUE,
    受注日   DATE       NOT NULL,
    PRIMARY KEY (受注ID),
    作成日時 TIMESTAMP  NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE 受注.受注顧客
(
    受注ID   UUID        NOT NULL,
    顧客ID   UUID        NOT NULL,
    郵便番号 VARCHAR(8)  NOT NULL,
    住所     VARCHAR(40) NOT NULL,
    建物     VARCHAR(40) NOT NULL,
    FOREIGN KEY (受注ID) REFERENCES 受注.受注 (受注ID),
    FOREIGN KEY (顧客ID) REFERENCES 顧客.顧客 (顧客ID),
    作成日時 TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE SEQUENCE 受注.受注番号 START WITH 13200000 NO CYCLE;

CREATE TABLE 受注.受注明細
(
    受注ID       UUID       NOT NULL,
    受注明細番号 UUID       NOT NULL,
    販売商品ID   UUID       NOT NULL,
    受注数量     NUMERIC(3) NOT NULL,
    PRIMARY KEY (受注ID, 受注明細番号),
    FOREIGN KEY (受注ID) REFERENCES 受注.受注 (受注ID),
    FOREIGN KEY (販売商品ID) REFERENCES 販売.販売商品 (販売商品ID),
    作成日時     TIMESTAMP  NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE 受注.有効な受注明細
(
    受注ID       UUID      NOT NULL,
    受注明細番号 UUID      NOT NULL,
    PRIMARY KEY (受注ID, 受注明細番号),
    FOREIGN KEY (受注ID, 受注明細番号) REFERENCES 受注.受注明細 (受注ID, 受注明細番号),
    作成日時     TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- </editor-fold>
