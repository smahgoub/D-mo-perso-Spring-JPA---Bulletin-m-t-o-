DROP TABLE IF EXISTS "measurement";
CREATE TABLE "measurement" (
                        id SERIAL PRIMARY KEY,
                        type VARCHAR NOT NULL,
                        unit VARCHAR NOT NULL,
                        value DOUBLE PRECISION NOT NULL,
                        measure_date DATE NOT NULL
);